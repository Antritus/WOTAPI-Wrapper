/*
 * Copyright 2023
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Antritus
 */

package me.antritus.world_of_tanks;

import com.google.gson.JsonParser;
import me.antritus.world_of_tanks.packet.PacketIn;
import me.antritus.world_of_tanks.packet.PacketOut;
import me.antritus.world_of_tanks.packet.PacketWrap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class Application {
	private final String id;
	private Realm realm;

	/**
	 * Creates an application which runs the requests/sends the packets.
	 * @param id ID of the application <a href="http://developers.wargaming.net/">...</a>
	 * @param realm The realm which the application should default to. If null defaults to eu
	 */
	public Application(String id, Realm realm) {
		this.id = id;
		this.realm = (realm != null) ? realm : Realm.EU;
	}
	/**
	 * Creates an application which runs the requests/sends the packets.
	 * Defaults to ap.worldoftanks.eu (Realm.EU)
	 * @param id ID of the application <a href="http://developers.wargaming.net/">...</a>
	 */	public Application(String id) {
		this.id = id;
		this.realm = Realm.EU;
	}

	public void setRealm(Realm realm){
		this.realm = (realm != null) ? realm : Realm.EU;
	}
	public String getId(){
		return id;
	}
	public Realm getRealm(){
		return realm;
	}
	public PacketIn request(PacketOut packet){
		BufferedReader bufferedReader = null;
		String ln;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(getInputStream(packet.send(this))));
			ln = bufferedReader.readLine();
			PacketIn incomingPacket = packet.receive(JsonParser.parseString(ln).getAsJsonObject());
			System.out.println(ln);
			bufferedReader.close();
			return incomingPacket;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	public PacketIn request(PacketWrap packetWrap) {
		return null;
	}
	public PacketIn request(URL url){
		return null;
	}
	private InputStream getInputStream(PacketWrap packetWrap, Proxy proxy){
		try {
			return connect(convert(packetWrap), proxy).getInputStream();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	private InputStream getInputStream(PacketWrap packetWrap){
		try {
			return connect(convert(packetWrap)).getInputStream();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	private URL convert(PacketWrap packetWrap){
		try {
			return new URL(packetWrap.asAPIRequest());
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}
	private URLConnection connect(URL url, Proxy proxy){
		try {
			return url.openConnection(proxy);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	private URLConnection connect(URL url){
		try {
			return url.openConnection();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

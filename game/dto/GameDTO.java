package com.xworkz.game.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {
	private String name;
	private String version;
	private String developedBy;
	private int maxPlayers;
	private boolean online;

	public GameDTO() {

	}

	public GameDTO(String name, String version, String developedBy, int maxPlayers, boolean online) {
		super();
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
		this.maxPlayers = maxPlayers;
		this.online = online;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", maxPlayers="
				+ maxPlayers + ", online=" + online + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Original hashcode :" + System.identityHashCode(this) + "for hashing returning 43");
		return 43;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof GameDTO) {
			GameDTO casted = (GameDTO) obj;
			if (this.name.equals(casted.name) && this.version.equals(casted.version)
					&& this.developedBy.equals(casted.developedBy)) {
				return true;
			}
		}
		return false;
	}

}

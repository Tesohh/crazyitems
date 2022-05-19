package com.tesohh;

import com.tesohh.commands.crazygive;
import com.tesohh.handlers.TorchHandler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Benvenuto in CrazyItems!");

		new TorchHandler(this);

		this.getCommand("crazygive").setExecutor(new crazygive());
	}

	@Override
	public void onDisable() {
		getLogger().info("Arrivedreci da CrazyItems!");
	}
}

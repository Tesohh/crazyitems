package com.tesohh;

import com.tesohh.handlers.TorchHandler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Benvenuto in CrazyItems!");

		new TorchHandler(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		return true;
	}

	@Override
	public void onDisable() {
		getLogger().info("Arrivedreci da CrazyItems!");
	}
}

package com.tesohh.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class crazygive implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player))
			return false;
		Player player = (Player) sender;
		ItemStack OOOOO = new ItemStack(Material.ITEM_FRAME, 1);
		player.getInventory().addItem(OOOOO);

		return true;
	}
}

package com.tesohh.handlers;

import java.util.Dictionary;

import com.tesohh.App;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TorchHandler implements Listener {
	public TorchHandler(App plugin) {
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler(ignoreCancelled = true)
	public void onTorchPlace(BlockPlaceEvent event) {
		Block block = event.getBlock();

		if (block.getType() != Material.TORCH) {
			return;
		}

		Bukkit.getLogger().info("Torch");
	}
}

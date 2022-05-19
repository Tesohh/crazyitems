package com.tesohh.classes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItem {
	String id;
	Material material;
	ItemMeta meta;

	public CustomItem(String id, Material material, ItemMeta meta) {
		this.id = id;
		this.material = material;
		this.meta = meta;
	}

	public ItemStack getItem() {
		ItemStack item = new ItemStack(this.material, 1);
		item.setItemMeta(meta);
		return item;
	}
}

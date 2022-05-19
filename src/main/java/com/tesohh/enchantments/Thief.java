package com.tesohh.enchantments;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class Thief extends Enchantment implements Listener {
	public Thief(NamespacedKey id) {
		super(id);
	}

	// @Override
	// public int getId() {
	// return 101;
	// }

	@Override
	public String getName() {
		return "Napoli";
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public int getStartLevel() {
		return 0;
	}

	@Override
	public EnchantmentTarget getItemTarget() {
		return null;
	}

	@Override
	public boolean isTreasure() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCursed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean conflictsWith(Enchantment other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canEnchantItem(ItemStack item) {
		// TODO Auto-generated method stub
		return false;
	}
}

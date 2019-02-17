package cn.davidma.tinymobfarm.core.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NBTHelper {
	
	// Lasso.
	public static String MOB = "capturedMob";
	public static String MOB_NAME = "mobName";
	public static String MOB_DATA = "mobData";
	public static String MOB_HEALTH = "mobHealth";
	public static String MOB_MAX_HEALTH = "mobMaxHealth";
	public static String MOB_HOSTILE = "mobHostile";
	
	public static NBTTagCompound getBaseTag(ItemStack stack) {
		return stack.getOrCreateChildTag(MOB);
	}
	
	public static void setBaseTag(ItemStack stack, NBTTagCompound nbt) {
		stack.getOrCreateTag().setTag(MOB, nbt);
	}
	
	public static boolean hasMob(ItemStack stack) {
		return stack.getOrCreateTag().hasKey(MOB);
	}
}
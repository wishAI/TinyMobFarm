package cn.davidma.idleloot.items;

import cn.davidma.idleloot.Main;
import net.minecraft.item.Item;

public class StandardItemBase extends Item {

	private String name;
	
	public StandardItemBase(String name) {
		this.name = name;
		setUnlocalizedName(this.name);
		setRegistryName(this.name);
		//setCreativeTab(CreativeTabs.MISC);
	}

	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

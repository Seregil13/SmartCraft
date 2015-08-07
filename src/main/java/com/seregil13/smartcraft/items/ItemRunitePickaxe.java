package com.seregil13.smartcraft.items;

import com.seregil13.smartcraft.creativetab.CreativeTab;
import com.seregil13.smartcraft.ref.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRunitePickaxe extends ItemPickaxeSC
{

    public ItemRunitePickaxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTab.SMARTCRAFT_TAB);
        this.setUnlocalizedName(Names.Tool.RUNITE_PICK);
    }
}

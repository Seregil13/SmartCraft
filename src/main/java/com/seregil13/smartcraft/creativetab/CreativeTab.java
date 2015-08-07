package com.seregil13.smartcraft.creativetab;

import com.seregil13.smartcraft.init.ModItems;
import com.seregil13.smartcraft.ref.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{

    public static final CreativeTabs SMARTCRAFT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.runiteSword;
        }
    };
}

package com.seregil13.smartcraft.items;

import com.seregil13.smartcraft.creativetab.CreativeTab;
import com.seregil13.smartcraft.ref.Names;

/**
 * Created by Alec on 5/20/2014.
 */
public class ItemRuniteSword extends ItemSwordSC
{
    public ItemRuniteSword(ToolMaterial material)
    {
        super(material);
        this.setCreativeTab(CreativeTab.SMARTCRAFT_TAB);
        this.setUnlocalizedName(Names.Tool.RUNITE_SWORD);
    }
}

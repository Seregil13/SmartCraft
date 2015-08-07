package com.seregil13.smartcraft.init;

import com.seregil13.smartcraft.items.ItemRunitePickaxe;
import com.seregil13.smartcraft.items.ItemRuniteSword;
import com.seregil13.smartcraft.ref.Names;
import com.seregil13.smartcraft.ref.Reference;
import com.seregil13.smartcraft.util.Materials;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    /*  Tools   */
    public static final ItemRunitePickaxe runitePick = new ItemRunitePickaxe(Materials.RUNITE);
    public static final ItemRuniteSword runiteSword = new ItemRuniteSword(Materials.RUNITE);

    public static void init()
    {
        GameRegistry.registerItem(runitePick, Names.Tool.RUNITE_PICK);
        GameRegistry.registerItem(runiteSword, Names.Tool.RUNITE_SWORD);
    }

}

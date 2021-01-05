package com.minttea.arcanearchive.common.inventory;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

//https://github.com/MrCrayfish/Backpacked/blob/1.16.X/src/main/java/com/mrcrayfish/backpacked/inventory/BackpackInventory.java
public class ArchiveBookInventory extends Inventory {


    public ArchiveBookInventory(int rows)
    {
        super(9*rows);
    }
}

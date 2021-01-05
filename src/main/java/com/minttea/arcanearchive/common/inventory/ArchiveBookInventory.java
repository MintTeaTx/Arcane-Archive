package com.minttea.arcanearchive.common.inventory;

import com.minttea.arcanearchive.common.blocks.ArchiveShelf;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

//https://github.com/MrCrayfish/Backpacked/blob/1.16.X/src/main/java/com/mrcrayfish/backpacked/inventory/BackpackInventory.java
public class ArchiveBookInventory implements IItemHandlerModifiable {

    public ArchiveShelf shelfThisIsIn;

    private Map<Item, Integer> itemMap = new HashMap<>();
    private int maxSize = 9;
    @Override
    public void setStackInSlot(int slot, @Nonnull ItemStack stack) {

    }

    @Override
    public int getSlots() {
        return 0;
    }

    @Nonnull
    @Override
    public ItemStack getStackInSlot(int slot) {
        return null;
    }

    @Nonnull
    @Override
    public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
        Item item = stack.getItem();
        if(!itemMap.containsKey(item) && itemMap.size()<maxSize)
        {
            itemMap.put(item, stack.getCount());
        }
        return null;
    }

    @Nonnull
    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate) {
        return null;
    }

    @Override
    public int getSlotLimit(int slot) {
        return 0;
    }

    @Override
    public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
        return false;
    }
}

package net.minecraft.world.item.enchantment;

import net.minecraft.world.entity.EnumItemSlot;

public class EnchantmentBinding extends Enchantment {

    public EnchantmentBinding(Enchantment.Rarity enchantment_rarity, EnumItemSlot... aenumitemslot) {
        super(enchantment_rarity, EnchantmentSlotType.WEARABLE, aenumitemslot);
    }

    @Override
    public int a(int i) {
        return 25;
    }

    @Override
    public int b(int i) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }
}

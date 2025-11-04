package org.example.test.test2.ModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;

public class ToolTier {
    public static final Tier RUBY = new Tier() {
        @Override
        public int getUses() {
            return 1561; // durability (same as diamond)
        }

        @Override
        public float getSpeed() {
            return 8.0F; // mining speed
        }

        @Override
        public float getAttackDamageBonus() {
            return 3.0F; // base damage bonus
        }

        @Override
        public int getLevel() {
            return 3; // harvest level (3 = diamond)
        }

        @Override
        public int getEnchantmentValue() {
            return 22; // enchantability
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.DIAMOND); // replace with your custom ruby item later
        }
    };
}

package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.items.Item;

public class Material {
    public static void materials() {

        // Common

        Main.dataManager.addItem(new Item<>("bone", "Bone", "bone", ItemType.MATERIAL)
            .setDescription("I used to be a femur.")
        );
        Main.dataManager.addItem(new Item<>("rotten-flesh", "Rotten Flesh", "rotten_flesh", ItemType.MATERIAL)
            .setDescription("For some reason you feel like you used to eat this.")
        );
        Main.dataManager.addItem(new Item<>("slime", "Slime", "slime_ball", ItemType.MATERIAL)
            .setDescription("Tastes like a booger. Don't ask how I know that.")
        );
        Main.dataManager.addItem(new Item<>("spider-silk", "Spider Silk", "string", ItemType.MATERIAL)
            .setDescription("Stronger than steel!")
        );
        Main.dataManager.addItem(new Item<>("stick", "Stick", "stick", ItemType.MATERIAL)
            .setDescription("Useful for creation of boom boom")
        );

        // Rare

        Main.dataManager.addItem(new Item<>("gunpowder", "Gunpowder", "gunpowder", ItemType.MATERIAL)
            .setDescription("Useful for creation of boom boom.")
            .setRarity(Rarity.RARE)
        );
        Main.dataManager.addItem(new Item<>("crude-iron", "Crude Iron", "raw_iron", ItemType.MATERIAL)
            .setDescription("Seems to have been wrecked relatively recently.")
            .setRarity(Rarity.RARE)
        );
        Main.dataManager.addItem(new Item<>("guardian-scale", "Guardian Scale", "prismarine_shard", ItemType.MATERIAL)
            .setDescription("It's made from some sort of prismatic aquamarine...")
            .setRarity(Rarity.RARE)
        );
        Main.dataManager.addItem(new Item<>("fungus", "Fungus", "brown_mushroom", ItemType.MATERIAL)
            .setDescription("Have a fungus.")
            .setRarity(Rarity.RARE)
        );
        Main.dataManager.addItem(new Item<>("frog-leg", "Frog Leg", "sugar_cane", ItemType.MATERIAL)
            .setDescription("Still twitching.")
            .setRarity(Rarity.RARE)
        );
        Main.dataManager.addItem(new Item<>("torn-cloth", "Torn Cloth", "rabbit_hide", ItemType.MATERIAL)
            .setDescription("Very low quality.")
            .setRarity(Rarity.RARE)
        );

        // Epic

        Main.dataManager.addItem(new Item<>("spider-eye", "Spider Eye", "spider_eye", ItemType.MATERIAL)
            .setDescription("You'd think you would get a lot more of these...")
            .setRarity(Rarity.EPIC)
        );
        Main.dataManager.addItem(new Item<>("bat-wing", "Bat Wing", "black_carpet", ItemType.MATERIAL)
            .setDescription("If it doesn't turn into an arm after 2-3 hours, it's probably not a vampire.")
            .setRarity(Rarity.EPIC)
        );
        Main.dataManager.addItem(new Item<>("blaze-rod", "Blaze Rod", "blaze_rod", ItemType.MATERIAL)
            .setDescription("What are these? Arms? Legs? Tentacles???")
            .setRarity(Rarity.EPIC)
        );

        // Legendary

        Main.dataManager.addItem(new Item<>("golden-nugget", "Golden Nugget", "gold_nugget", ItemType.MATERIAL)
            .setDescription("Shiny...")
            .setRarity(Rarity.LEGENDARY)
        );
        Main.dataManager.addItem(new Item<>("necrotic-matter", "Necrotic Matter", "coal", ItemType.MATERIAL)
            .setDescription("Mr Dweevius, I don't feel so good...")
            .setRarity(Rarity.LEGENDARY)
        );

        // Mythical
        
        Main.dataManager.addItem(new Item<>("echo-shard", "Echo Shard", "echo_shard", ItemType.MATERIAL)
            .setDescription("Kinda...glitchy?")
            .setRarity(Rarity.MYTHIC)
        );
        Main.dataManager.addItem(new Item<>("ender-pearl", "Ender Pearl", "ender_pearl", ItemType.MATERIAL)
            .setDescription("Please be the eyes, please be the eyes...")
            .setRarity(Rarity.MYTHIC)
        );

    }
}

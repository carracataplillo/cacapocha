package com.dedalo.cacapocha;

import java.util.Map;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.sounds.SoundEvents;


import net.minecraftforge.registries.RegistryObject;

public final class CacapochaEquipment {

    private CacapochaEquipment() {
    }

    public static void init() {
        // Este método existe únicamente para forzar
        // la inicialización de los campos estáticos.
    }

    // =========================================================
    // TAG DE REPARACIÓN
    // =========================================================

    public static final TagKey<Item> REPAIRS_CACA =
            TagKey.create(
                    Registries.ITEM,
                    Identifier.fromNamespaceAndPath(
                            cacapocha.MODID,
                            "repairs_caca"
                    )
            );

    // =========================================================
    // ASSET DE LA ARMADURA
    // =========================================================

    public static final ResourceKey<EquipmentAsset> CACA_ARMOR_ASSET =
            ResourceKey.create(
                    EquipmentAssets.ROOT_ID,
                    Identifier.fromNamespaceAndPath(
                            cacapocha.MODID,
                            "caca"
                    )
            );

    // =========================================================
    // MATERIAL DE ARMADURA
    // =========================================================

    public static final ArmorMaterial CACA_ARMOR_MATERIAL =
            new ArmorMaterial(
                    20,

                    Map.of(
                            ArmorType.HELMET, 9,
                            ArmorType.CHESTPLATE, 21,
                            ArmorType.LEGGINGS, 18,
                            ArmorType.BOOTS, 9
                    ),

                    15,

                    SoundEvents.ARMOR_EQUIP_IRON,

                    3.0F,

                    3.0F,

                    REPAIRS_CACA,

                    CACA_ARMOR_ASSET
            );

    // =========================================================
    // MATERIAL DE HERRAMIENTAS
    // =========================================================

    public static final ToolMaterial CACA_TOOL_MATERIAL =
            new ToolMaterial(
                    BlockTags.INCORRECT_FOR_IRON_TOOL,
                    300,
                    6.0F,
                    2.0F,
                    15,
                    REPAIRS_CACA
            );

    // =========================================================
    // ARMADURA
    // =========================================================

    public static final RegistryObject<Item> CACA_HELMET =
            cacapocha.ITEMS.register(
                    "caca_helmet",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_helmet"))
                                    .humanoidArmor(
                                            CACA_ARMOR_MATERIAL,
                                            ArmorType.HELMET
                                    )
                                    .durability(
                                            ArmorType.HELMET.getDurability(20)
                                    )
                    )
            );

    public static final RegistryObject<Item> CACA_CHESTPLATE =
            cacapocha.ITEMS.register(
                    "caca_chestplate",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_chestplate"))
                                    .humanoidArmor(
                                            CACA_ARMOR_MATERIAL,
                                            ArmorType.CHESTPLATE
                                    )
                                    .durability(
                                            ArmorType.CHESTPLATE.getDurability(20)
                                    )
                    )
            );

    public static final RegistryObject<Item> CACA_LEGGINGS =
            cacapocha.ITEMS.register(
                    "caca_leggings",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_leggings"))
                                    .humanoidArmor(
                                            CACA_ARMOR_MATERIAL,
                                            ArmorType.LEGGINGS
                                    )
                                    .durability(
                                            ArmorType.LEGGINGS.getDurability(20)
                                    )
                    )
            );

    public static final RegistryObject<Item> CACA_BOOTS =
            cacapocha.ITEMS.register(
                    "caca_boots",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_boots"))
                                    .humanoidArmor(
                                            CACA_ARMOR_MATERIAL,
                                            ArmorType.BOOTS
                                    )
                                    .durability(
                                            ArmorType.BOOTS.getDurability(20)
                                    )
                    )
            );

    // =========================================================
    // ESPADA
    // =========================================================

    public static final RegistryObject<Item> CACA_SWORD =
            cacapocha.ITEMS.register(
                    "caca_sword",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_sword"))
                                    .sword(
                                            CACA_TOOL_MATERIAL,
                                            9.0F,
                                            -2.4F
                                    )
                    )
            );

    // =========================================================
    // PICO
    // =========================================================

    public static final RegistryObject<Item> CACA_PICKAXE =
            cacapocha.ITEMS.register(
                    "caca_pickaxe",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_pickaxe"))
                                    .pickaxe(
                                            CACA_TOOL_MATERIAL,
                                            3.0F,
                                            -2.8F
                                    )
                    )
            );

    // =========================================================
    // HACHA
    // =========================================================

    public static final RegistryObject<Item> CACA_AXE =
            cacapocha.ITEMS.register(
                    "caca_axe",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_axe"))
                                    .axe(
                                            CACA_TOOL_MATERIAL,
                                            15.0F,
                                            -3.1F
                                    )
                    )
            );

    // =========================================================
    // PALA
    // =========================================================

    public static final RegistryObject<Item> CACA_SHOVEL =
            cacapocha.ITEMS.register(
                    "caca_shovel",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_shovel"))
                                    .shovel(
                                            CACA_TOOL_MATERIAL,
                                            3.0F,
                                            -3.0F
                                    )
                    )
            );

    // =========================================================
    // AZADA
    // =========================================================

    public static final RegistryObject<Item> CACA_HOE =
            cacapocha.ITEMS.register(
                    "caca_hoe",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(cacapocha.ITEMS.key("caca_hoe"))
                                    .hoe(
                                            CACA_TOOL_MATERIAL,
                                            0.0F,
                                            -3.0F
                                    )
                    )
            );
}
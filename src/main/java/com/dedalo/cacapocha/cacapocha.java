package com.dedalo.cacapocha;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(cacapocha.MODID)
public final class cacapocha {

    public static final String MODID = "cacapocha";

    // =========================================================
    // REGISTROS
    // =========================================================

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    MODID
            );

    // =========================================================
    // BLOQUE: MINERAL DE CACAPOCHA
    // =========================================================

    public static final RegistryObject<Block> CACAPOCHA_ORE =
            BLOCKS.register(
                    "cacapocha_ore",
                    () -> new Block(
                            BlockBehaviour.Properties.of()
                                    .setId(BLOCKS.key("cacapocha_ore"))
                                    .mapColor(MapColor.STONE)
                                    .strength(3, 6)
                    )
            );

    // =========================================================
    // ITEM DEL MINERAL
    // =========================================================

    public static final RegistryObject<Item> CACAPOCHA_ORE_ITEM =
            ITEMS.register(
                    "cacapocha_ore",
                    () -> new BlockItem(
                            CACAPOCHA_ORE.get(),
                            new Item.Properties()
                                    .setId(ITEMS.key("cacapocha_ore"))
                    )
            );

    // =========================================================
    // CACA
    // =========================================================

    public static final RegistryObject<Item> CACA =
            ITEMS.register(
                    "caca",
                    () -> new Item(
                            new Item.Properties()
                                    .setId(ITEMS.key("caca"))
                    )
            );

    // =========================================================
    // CREATIVE TAB
    // =========================================================

    public static final RegistryObject<CreativeModeTab> CACAPOCHA_TAB =
            CREATIVE_MODE_TABS.register(
                    "cacapocha_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> CACAPOCHA_ORE_ITEM.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {

                                output.accept(CACAPOCHA_ORE_ITEM.get());
                                output.accept(CACA.get());

                                // Armadura
                                output.accept(
                                        CacapochaEquipment.CACA_HELMET.get()
                                );

                                output.accept(
                                        CacapochaEquipment.CACA_CHESTPLATE.get()
                                );

                                output.accept(
                                        CacapochaEquipment.CACA_LEGGINGS.get()
                                );

                                output.accept(
                                        CacapochaEquipment.CACA_BOOTS.get()
                                );

                                // Herramientas
                                output.accept(
                                        CacapochaEquipment.CACA_SWORD.get()
                                );

                                output.accept(
                                        CacapochaEquipment.CACA_PICKAXE.get()
                                );

                                output.accept(
                                        CacapochaEquipment.CACA_AXE.get()
                                );

                                output.accept(
                                        CacapochaEquipment.CACA_SHOVEL.get()
                                );

                                output.accept(
                                        CacapochaEquipment.CACA_HOE.get()
                                );
                            })
                            .build()
            );

    // =========================================================
    // CONSTRUCTOR
    // =========================================================

    public cacapocha(FMLJavaModLoadingContext context) {

    var modBusGroup = context.getModBusGroup();

    // Fuerza la inicialización de CacapochaEquipment
    CacapochaEquipment.init();

    BLOCKS.register(modBusGroup);
    ITEMS.register(modBusGroup);
    CREATIVE_MODE_TABS.register(modBusGroup);
}
}
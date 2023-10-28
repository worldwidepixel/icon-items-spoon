package xyz.blurryface.iconitems.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.blurryface.iconitems.Iconitems;

public class ModItems {

    // items to register

    public static final Item MODRINTH = registerItem("modrinth", new Item(new FabricItemSettings())); // modrinth ITEM
    public static final Item CURSEFORGE = registerItem("curseforge", new Item(new FabricItemSettings())); // curseforge ITEM
    public static final Item PRIDECRAFT = registerItem("pridecraft", new Item(new FabricItemSettings())); // pridecraft ITEM
    public static final Item CRSS = registerItem("crss", new Item(new FabricItemSettings())); // crss ITEM
    public static final Item DRSS = registerItem("drss", new Item(new FabricItemSettings())); // drss ITEM
    // public static final Item tcf = registerItem("tcf", new Item(new FabricItemSettings())); // tcf ITEM
    public static final Item MINECRAFTJAVA = registerItem("minecraft_java", new Item(new FabricItemSettings())); // Java Minecraft ITEM
    public static final Item MINECRAFTBEDROCK = registerItem("minecraft_bedrock", new Item(new FabricItemSettings())); // Bedrock Minecraft ITEM
    public static final Item DEVINREAL = registerItem("devin", new Item(new FabricItemSettings())); // DEVIN ITEM
    public static final Item MAYAREAL = registerItem("maya", new Item(new FabricItemSettings())); // MAYA ITEM
    public static final Item GITHUB = registerItem("github", new Item(new FabricItemSettings())); //Github item
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {  //makes the item appear on the Creative Inventory

        entries.add(MODRINTH);
        entries.add(CURSEFORGE);
        entries.add(PRIDECRAFT);
        entries.add(CRSS);
        entries.add(DRSS);
        // entries.add(tcf);
        entries.add(MINECRAFTJAVA);
        entries.add(MINECRAFTBEDROCK);
        entries.add(DEVINREAL);
        entries.add(MAYAREAL);
        entries.add(GITHUB);

    }


    // thing that makes items register
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Iconitems.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Iconitems.LOGGER.info("Making items real :3");


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }



}
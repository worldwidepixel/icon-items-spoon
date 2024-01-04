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
    public static final Item TCF = registerItem("tcf", new Item(new FabricItemSettings())); // tcf ITEM
    public static final Item MINECRAFTJAVA = registerItem("minecraft_java", new Item(new FabricItemSettings())); // Java Minecraft ITEM
    public static final Item MINECRAFTBEDROCK = registerItem("minecraft_bedrock", new Item(new FabricItemSettings())); // Bedrock Minecraft ITEM
    public static final Item DEVINREAL = registerItem("devin", new Item(new FabricItemSettings())); // DEVIN ITEM
    public static final Item MAYAREAL = registerItem("maya", new Item(new FabricItemSettings())); // MAYA ITEM
    public static final Item GITHUB = registerItem("github", new Item(new FabricItemSettings())); //Github item
    public static final Item ICONITEMS = registerItem("iconitems", new Item(new FabricItemSettings())); //MOD ICON item
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings())); //Bribe to get approved in modrinth faster :troll:

    //0.2 items

    public static final Item PRISMLAUNCHER = registerItem("prismlauncher", new Item(new FabricItemSettings())); //prism logo item
    public static final Item STEAM = registerItem("steam", new Item(new FabricItemSettings())); //Steam logo
    public static final Item WHATSAPP = registerItem("whatsapp", new Item(new FabricItemSettings())); //Whatsapp logo
    public static final Item WINDOWS11 = registerItem("windows11", new Item(new FabricItemSettings())); //win11 logo
    public static final Item WINDOWS10 = registerItem("windows10", new Item(new FabricItemSettings())); //win10 logo
    public static final Item LINUX = registerItem("linux", new Item(new FabricItemSettings())); //Tux
    public static final Item MACOS = registerItem("macos", new Item(new FabricItemSettings())); //Latest macOS icon

    // 2.0 ITEMS ?

    public static final Item ALTO = registerItem("alto", new Item(new FabricItemSettings()));
    public static final Item NINEMINECRAFT = registerItem("nineminecraft", new Item(new FabricItemSettings()));
    public static final Item TWOFIVEMINECRAFT = registerItem("25565minecraft", new Item(new FabricItemSettings()));
    public static final Item LOOP = registerItem("loop", new Item(new FabricItemSettings()));
    public static final Item SPIRAL = registerItem("spiral", new Item(new FabricItemSettings()));
    public static final Item MODSYNTH = registerItem("modsynth", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {  //makes the item appear on the Creative Inventory

        entries.add(MODRINTH);
        entries.add(CURSEFORGE);
        entries.add(PRIDECRAFT);
        entries.add(CRSS);
        entries.add(DRSS);
        entries.add(TCF);
        entries.add(MINECRAFTJAVA);
        entries.add(MINECRAFTBEDROCK);
        entries.add(DEVINREAL);
        entries.add(MAYAREAL);
        entries.add(GITHUB);
        entries.add(ICONITEMS);
        entries.add(JADE);

        //0.2 items

        entries.add(PRISMLAUNCHER);
        entries.add(STEAM);
        entries.add(WHATSAPP);
        entries.add(WINDOWS11);
        entries.add(WINDOWS10);
        entries.add(LINUX);
        entries.add(MACOS);

        //2.0 items ?

        entries.add(ALTO);
        entries.add(NINEMINECRAFT);
        entries.add(TWOFIVEMINECRAFT);
        entries.add(LOOP);
        entries.add(SPIRAL);
        entries.add(MODSYNTH);

    }


    // thing that makes items register + log thing
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Iconitems.MOD_ID, name), item);
    }
    public static void registerModItems() {

        //Log messages and Ads

        Iconitems.LOGGER.info("Making items real :3");
        Iconitems.LOGGER.info("By the way, if you ever wanted to make your Minecraft more gay");
        Iconitems.LOGGER.info("Go download pridepack on https://pridecraft.gay/pridepack");
        Iconitems.LOGGER.info("  ");
        Iconitems.LOGGER.info("Running into performance issues?");
        Iconitems.LOGGER.info("Try Devin's Additive today!");
        Iconitems.LOGGER.info("https://modrinth.com/modpack/additive");
        Iconitems.LOGGER.info("  ");
        Iconitems.LOGGER.info("Oh, also some of these logos were created by WorldWidePixel.");
        Iconitems.LOGGER.info("https://worldwidepixel.ca/");


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }



}

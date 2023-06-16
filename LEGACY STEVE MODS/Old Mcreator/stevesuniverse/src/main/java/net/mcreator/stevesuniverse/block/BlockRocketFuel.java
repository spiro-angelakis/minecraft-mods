
package net.mcreator.stevesuniverse.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import net.mcreator.stevesuniverse.ElementsStevesUniverse;

@ElementsStevesUniverse.ModElement.Tag
public class BlockRocketFuel extends ElementsStevesUniverse.ModElement {
	@GameRegistry.ObjectHolder("stevesuniverse:rocketfuel")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("stevesuniverse:rocketfuel")
	public static final Item item = null;
	private Fluid fluid;
	public BlockRocketFuel(ElementsStevesUniverse instance) {
		super(instance, 6);
		fluid = new Fluid("rocketfuel", new ResourceLocation("stevesuniverse:blocks/fuelstill"),
				new ResourceLocation("stevesuniverse:blocks/fuelstill")).setLuminosity(1).setDensity(1000).setViscosity(1000).setGaseous(true);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, Material.WATER) {
		}.setUnlocalizedName("rocketfuel").setRegistryName("rocketfuel"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("rocketfuel"));
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		FluidRegistry.registerFluid(fluid);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelBakery.registerItemVariants(item);
		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("stevesuniverse:rocketfuel", "rocketfuel");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("stevesuniverse:rocketfuel", "rocketfuel");
			}
		});
	}
}

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class anti_air_missile extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer tube;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer barrel;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer lid_lip1;
	private final ModelRenderer lid_lip2;
	private final ModelRenderer lid_lip3;
	private final ModelRenderer lid_lip4;

	public anti_air_missile() {
		textureWidth = 16;
		textureHeight = 16;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		tube = new ModelRenderer(this);
		tube.setRotationPoint(0.0F, -12.0F, 0.0F);
		all.addChild(tube);
		tube.setTextureOffset(0, 0).addBox(-0.8284F, -10.0F, -2.0F, 1.0F, 20.0F, 4.0F, 0.0F, false);
		tube.setTextureOffset(0, 0).addBox(-2.0F, -10.0F, -0.8284F, 4.0F, 20.0F, 1.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(0, 0).addBox(-2.0F, -10.0F, -0.8284F, 4.0F, 20.0F, 1.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 0).addBox(-0.8284F, -10.0F, -2.0F, 1.0F, 20.0F, 4.0F, 0.0F, false);

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, -1.0F, 0.0F);
		all.addChild(barrel);
		barrel.setTextureOffset(8, 11).addBox(-0.6213F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		barrel.setTextureOffset(8, 11).addBox(-1.5F, -1.0F, -0.6213F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(8, 11).addBox(-1.5F, -1.0F, -0.6213F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		octagon_r2.setTextureOffset(8, 11).addBox(-0.6213F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		lid_lip1 = new ModelRenderer(this);
		lid_lip1.setRotationPoint(0.0F, -22.0F, 0.0F);
		all.addChild(lid_lip1);
		setRotationAngle(lid_lip1, 0.3927F, 0.0F, 0.0F);
		lid_lip1.setTextureOffset(10, 0).addBox(-1.0F, -3.0761F, 1.6173F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		lid_lip2 = new ModelRenderer(this);
		lid_lip2.setRotationPoint(0.0F, -22.0F, 0.0F);
		all.addChild(lid_lip2);
		setRotationAngle(lid_lip2, 0.0F, 1.5708F, -0.3927F);
		lid_lip2.setTextureOffset(10, 0).addBox(-1.0F, -3.0761F, 1.6173F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		lid_lip3 = new ModelRenderer(this);
		lid_lip3.setRotationPoint(0.0F, -22.0F, 0.0F);
		all.addChild(lid_lip3);
		setRotationAngle(lid_lip3, -2.7489F, 0.0F, -3.1416F);
		lid_lip3.setTextureOffset(10, 0).addBox(-1.0F, -3.0761F, 1.6173F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		lid_lip4 = new ModelRenderer(this);
		lid_lip4.setRotationPoint(0.0F, -22.0F, 0.0F);
		all.addChild(lid_lip4);
		setRotationAngle(lid_lip4, 0.0F, -1.5708F, 0.3927F);
		lid_lip4.setTextureOffset(10, 0).addBox(-1.0F, -3.0761F, 1.6173F, 2.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		all.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
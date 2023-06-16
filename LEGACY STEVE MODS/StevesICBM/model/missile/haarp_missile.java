// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class haarp_missile extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer tube;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer barrel1;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer barrel2;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer barrel3;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer tip1;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer tip2;
	private final ModelRenderer octagon_r5;

	public haarp_missile() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		tube = new ModelRenderer(this);
		tube.setRotationPoint(0.0F, -8.0F, 0.0F);
		all.addChild(tube);
		tube.setTextureOffset(0, 0).addBox(-1.5913F, -36.0F, -8.0F, 3.0F, 40.0F, 16.0F, 0.0F, false);
		tube.setTextureOffset(0, 0).addBox(-8.0F, -36.0F, -1.5913F, 16.0F, 40.0F, 3.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, -16.0F, 0.0F);
		tube.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 40.0F, 3.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.0F, 40.0F, 16.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, -16.0F, 0.0F);
		tube.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 40.0F, 3.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.0F, 40.0F, 16.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, -16.0F, 0.0F);
		tube.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.0F, 40.0F, 16.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, -16.0F, 0.0F);
		tube.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.0F, 40.0F, 16.0F, 0.0F, false);

		barrel1 = new ModelRenderer(this);
		barrel1.setRotationPoint(-4.0F, -2.0F, 2.0F);
		all.addChild(barrel1);
		barrel1.setTextureOffset(0, 59).addBox(-0.8284F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		barrel1.setTextureOffset(0, 59).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel1.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(0, 59).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 59).addBox(-0.8284F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(4.0F, -2.0F, 2.0F);
		all.addChild(barrel2);
		barrel2.setTextureOffset(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		barrel2.setTextureOffset(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel2.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(0.0F, -2.0F, -4.0F);
		all.addChild(barrel3);
		barrel3.setTextureOffset(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		barrel3.setTextureOffset(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel3.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
		octagon_r3.setTextureOffset(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		octagon_r3.setTextureOffset(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		tip1 = new ModelRenderer(this);
		tip1.setRotationPoint(0.0F, -47.0F, 0.0F);
		all.addChild(tip1);
		tip1.setTextureOffset(84, 106).addBox(-3.3137F, -3.0F, -8.0F, 6.0F, 6.0F, 16.0F, 0.0F, false);
		tip1.setTextureOffset(84, 106).addBox(-8.0F, -3.0F, -3.3137F, 16.0F, 6.0F, 6.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		tip1.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, -0.7854F, 0.0F);
		octagon_r4.setTextureOffset(84, 106).addBox(-8.0F, -3.0F, -3.3137F, 16.0F, 6.0F, 6.0F, 0.0F, false);
		octagon_r4.setTextureOffset(84, 106).addBox(-3.3137F, -3.0F, -8.0F, 6.0F, 6.0F, 16.0F, 0.0F, false);

		tip2 = new ModelRenderer(this);
		tip2.setRotationPoint(0.0F, -52.0F, 0.0F);
		all.addChild(tip2);
		tip2.setTextureOffset(106, 58).addBox(-1.6569F, -2.0F, -4.0F, 3.0F, 4.0F, 8.0F, 0.0F, false);
		tip2.setTextureOffset(106, 58).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.0F, 0.0F, false);

		octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		tip2.addChild(octagon_r5);
		setRotationAngle(octagon_r5, 0.0F, -0.7854F, 0.0F);
		octagon_r5.setTextureOffset(106, 58).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.0F, 0.0F, false);
		octagon_r5.setTextureOffset(106, 58).addBox(-1.6569F, -2.0F, -4.0F, 3.0F, 4.0F, 8.0F, 0.0F, false);
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
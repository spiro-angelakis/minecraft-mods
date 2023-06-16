// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class moon_rocket extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer barrel_neck;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer barrel;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer tube1;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer tube2;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer tube3;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer tube4;
	private final ModelRenderer octagon_r5;
	private final ModelRenderer tube5;
	private final ModelRenderer octagon_r6;
	private final ModelRenderer fuel1;
	private final ModelRenderer octagon_r7;
	private final ModelRenderer fuel2;
	private final ModelRenderer octagon_r8;
	private final ModelRenderer fin1;
	private final ModelRenderer fin2;

	public moon_rocket() {
		textureWidth = 256;
		textureHeight = 256;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		barrel_neck = new ModelRenderer(this);
		barrel_neck.setRotationPoint(0.0F, -6.5F, 0.0F);
		all.addChild(barrel_neck);
		barrel_neck.setTextureOffset(51, 0).addBox(-1.6569F, -2.0F, -4.0F, 3.0F, 4.0F, 8.0F, 0.0F, false);
		barrel_neck.setTextureOffset(51, 0).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel_neck.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(51, 0).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.0F, 0.0F, false);
		octagon_r1.setTextureOffset(51, 0).addBox(-1.6569F, -2.0F, -4.0F, 3.0F, 4.0F, 8.0F, 0.0F, false);

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, -2.0F, 0.0F);
		all.addChild(barrel);
		barrel.setTextureOffset(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.0F, 4.0F, 16.0F, 0.0F, false);
		barrel.setTextureOffset(49, 0).addBox(-8.0F, -2.0F, -1.5913F, 16.0F, 4.0F, 3.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(49, 0).addBox(-8.0F, -2.0F, -1.5913F, 16.0F, 4.0F, 3.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.0F, 4.0F, 16.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(49, 0).addBox(-8.0F, -2.0F, -1.5913F, 16.0F, 4.0F, 3.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.0F, 4.0F, 16.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.0F, 4.0F, 16.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.0F, 4.0F, 16.0F, 0.0F, false);

		tube1 = new ModelRenderer(this);
		tube1.setRotationPoint(0.0F, -48.0F, 0.0F);
		all.addChild(tube1);
		tube1.setTextureOffset(0, 144).addBox(-6.6274F, -40.0F, -16.0F, 13.0F, 80.0F, 32.0F, 0.0F, false);
		tube1.setTextureOffset(0, 144).addBox(-16.0F, -40.0F, -6.6274F, 32.0F, 80.0F, 13.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube1.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(0, 144).addBox(-16.0F, -40.0F, -6.6274F, 32.0F, 80.0F, 13.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 144).addBox(-6.6274F, -40.0F, -16.0F, 13.0F, 80.0F, 32.0F, 0.0F, false);

		tube2 = new ModelRenderer(this);
		tube2.setRotationPoint(0.0F, -97.0F, 0.0F);
		all.addChild(tube2);
		tube2.setTextureOffset(0, 94).addBox(-5.799F, -10.0F, -14.0F, 11.0F, 20.0F, 28.0F, 0.0F, false);
		tube2.setTextureOffset(0, 94).addBox(-14.0F, -10.0F, -5.799F, 28.0F, 20.0F, 11.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube2.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
		octagon_r3.setTextureOffset(0, 94).addBox(-14.0F, -10.0F, -5.799F, 28.0F, 20.0F, 11.0F, 0.0F, false);
		octagon_r3.setTextureOffset(0, 94).addBox(-5.799F, -10.0F, -14.0F, 11.0F, 20.0F, 28.0F, 0.0F, false);

		tube3 = new ModelRenderer(this);
		tube3.setRotationPoint(0.0F, -114.0F, 0.0F);
		all.addChild(tube3);
		tube3.setTextureOffset(0, 51).addBox(-4.9706F, -9.0F, -12.0F, 9.0F, 18.0F, 24.0F, 0.0F, false);
		tube3.setTextureOffset(0, 51).addBox(-12.0F, -9.0F, -4.9706F, 24.0F, 18.0F, 9.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube3.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, -0.7854F, 0.0F);
		octagon_r4.setTextureOffset(0, 51).addBox(-12.0F, -9.0F, -4.9706F, 24.0F, 18.0F, 9.0F, 0.0F, false);
		octagon_r4.setTextureOffset(0, 51).addBox(-4.9706F, -9.0F, -12.0F, 9.0F, 18.0F, 24.0F, 0.0F, false);

		tube4 = new ModelRenderer(this);
		tube4.setRotationPoint(0.0F, -129.0F, 0.0F);
		all.addChild(tube4);
		tube4.setTextureOffset(0, 33).addBox(-4.1421F, -8.0F, -10.0F, 8.0F, 16.0F, 20.0F, 0.0F, false);
		tube4.setTextureOffset(0, 33).addBox(-10.0F, -8.0F, -4.1421F, 20.0F, 16.0F, 8.0F, 0.0F, false);

		octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube4.addChild(octagon_r5);
		setRotationAngle(octagon_r5, 0.0F, -0.7854F, 0.0F);
		octagon_r5.setTextureOffset(0, 33).addBox(-10.0F, -8.0F, -4.1421F, 20.0F, 16.0F, 8.0F, 0.0F, false);
		octagon_r5.setTextureOffset(0, 33).addBox(-4.1421F, -8.0F, -10.0F, 8.0F, 16.0F, 20.0F, 0.0F, false);

		tube5 = new ModelRenderer(this);
		tube5.setRotationPoint(0.0F, -142.0F, 0.0F);
		all.addChild(tube5);
		tube5.setTextureOffset(0, 0).addBox(-3.3137F, -6.0F, -8.0F, 6.0F, 12.0F, 16.0F, 0.0F, false);
		tube5.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -3.3137F, 16.0F, 12.0F, 6.0F, 0.0F, false);

		octagon_r6 = new ModelRenderer(this);
		octagon_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube5.addChild(octagon_r6);
		setRotationAngle(octagon_r6, 0.0F, -0.7854F, 0.0F);
		octagon_r6.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -3.3137F, 16.0F, 12.0F, 6.0F, 0.0F, false);
		octagon_r6.setTextureOffset(0, 0).addBox(-3.3137F, -6.0F, -8.0F, 6.0F, 12.0F, 16.0F, 0.0F, false);

		fuel1 = new ModelRenderer(this);
		fuel1.setRotationPoint(0.0F, -53.0F, -24.0F);
		all.addChild(fuel1);
		fuel1.setTextureOffset(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.0F, 90.0F, 16.0F, 0.0F, false);
		fuel1.setTextureOffset(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.0F, 0.0F, false);

		octagon_r7 = new ModelRenderer(this);
		octagon_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		fuel1.addChild(octagon_r7);
		setRotationAngle(octagon_r7, 0.0F, -0.7854F, 0.0F);
		octagon_r7.setTextureOffset(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.0F, 0.0F, false);
		octagon_r7.setTextureOffset(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.0F, 90.0F, 16.0F, 0.0F, false);

		fuel2 = new ModelRenderer(this);
		fuel2.setRotationPoint(0.0F, -53.0F, 24.0F);
		all.addChild(fuel2);
		fuel2.setTextureOffset(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.0F, 90.0F, 16.0F, 0.0F, false);
		fuel2.setTextureOffset(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.0F, 0.0F, false);

		octagon_r8 = new ModelRenderer(this);
		octagon_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		fuel2.addChild(octagon_r8);
		setRotationAngle(octagon_r8, 0.0F, -0.7854F, 0.0F);
		octagon_r8.setTextureOffset(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.0F, 0.0F, false);
		octagon_r8.setTextureOffset(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.0F, 90.0F, 16.0F, 0.0F, false);

		fin1 = new ModelRenderer(this);
		fin1.setRotationPoint(0.0F, -37.0F, 0.0F);
		all.addChild(fin1);
		setRotationAngle(fin1, 0.0F, 0.0F, -0.3927F);
		fin1.setTextureOffset(0, 206).addBox(-2.2011F, -18.7976F, 0.0F, 28.0F, 49.0F, 1.0F, 0.0F, false);

		fin2 = new ModelRenderer(this);
		fin2.setRotationPoint(0.0F, -37.0F, 0.0F);
		all.addChild(fin2);
		setRotationAngle(fin2, 3.1416F, 0.0F, -2.7489F);
		fin2.setTextureOffset(0, 206).addBox(-2.2011F, -18.7976F, 0.0F, 28.0F, 49.0F, 1.0F, 0.0F, false);
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
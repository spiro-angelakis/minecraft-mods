// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class emp_downward extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer tube;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer cusp;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer barrel;
	private final ModelRenderer hexadecagon_r9;
	private final ModelRenderer hexadecagon_r10;
	private final ModelRenderer hexadecagon_r11;
	private final ModelRenderer hexadecagon_r12;
	private final ModelRenderer flap1;
	private final ModelRenderer flap2;
	private final ModelRenderer flap3;
	private final ModelRenderer flap4;
	private final ModelRenderer head;

	public emp_downward() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, -40.0F, 0.0F);
		setRotationAngle(all, -3.1416F, 0.0F, 0.0F);
		

		tube = new ModelRenderer(this);
		tube.setRotationPoint(8.0F, -24.0F, -8.0F);
		all.addChild(tube);
		tube.setTextureOffset(0, 0).addBox(-9.5913F, -33.0F, 0.0F, 3.0F, 50.0F, 16.0F, 0.0F, false);
		tube.setTextureOffset(0, 0).addBox(-16.0F, -33.0F, 6.4087F, 16.0F, 50.0F, 3.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-8.0F, -25.0F, -1.5913F, 16.0F, 50.0F, 3.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 50.0F, 16.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-8.0F, -25.0F, -1.5913F, 16.0F, 50.0F, 3.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 50.0F, 16.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 50.0F, 16.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(0, 0).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 50.0F, 16.0F, 0.0F, false);

		cusp = new ModelRenderer(this);
		cusp.setRotationPoint(8.0F, 3.0F, -8.0F);
		all.addChild(cusp);
		cusp.setTextureOffset(0, 70).addBox(-9.7902F, -10.0F, -1.0F, 3.0F, 4.0F, 18.0F, 0.0F, false);
		cusp.setTextureOffset(0, 70).addBox(-17.0F, -10.0F, 6.2098F, 18.0F, 4.0F, 3.0F, 0.0F, false);

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(-8.0F, -8.0F, 8.0F);
		cusp.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r5.setTextureOffset(0, 70).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.0F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.0F, 4.0F, 18.0F, 0.0F, false);

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(-8.0F, -8.0F, 8.0F);
		cusp.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r6.setTextureOffset(0, 70).addBox(-9.0F, -2.0F, -1.7902F, 18.0F, 4.0F, 3.0F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.0F, 4.0F, 18.0F, 0.0F, false);

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(-8.0F, -8.0F, 8.0F);
		cusp.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r7.setTextureOffset(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.0F, 4.0F, 18.0F, 0.0F, false);

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(-8.0F, -8.0F, 8.0F);
		cusp.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r8.setTextureOffset(0, 70).addBox(-1.7902F, -2.0F, -9.0F, 3.0F, 4.0F, 18.0F, 0.0F, false);

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(8.0F, 7.0F, -8.0F);
		all.addChild(barrel);
		barrel.setTextureOffset(0, 95).addBox(-8.7956F, -10.0F, 4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		barrel.setTextureOffset(0, 95).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 4.0F, 1.0F, 0.0F, false);

		hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(-8.0F, -8.0F, 8.0F);
		barrel.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r9.setTextureOffset(0, 95).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r9.setTextureOffset(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(-8.0F, -8.0F, 8.0F);
		barrel.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r10.setTextureOffset(0, 95).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r10.setTextureOffset(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(-8.0F, -8.0F, 8.0F);
		barrel.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r11.setTextureOffset(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(-8.0F, -8.0F, 8.0F);
		barrel.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r12.setTextureOffset(0, 95).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		flap1 = new ModelRenderer(this);
		flap1.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(flap1);
		setRotationAngle(flap1, -0.3054F, 0.0F, 0.0F);
		flap1.setTextureOffset(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, 0.0F, false);

		flap2 = new ModelRenderer(this);
		flap2.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(flap2);
		setRotationAngle(flap2, 2.8362F, -1.4835F, 3.1416F);
		flap2.setTextureOffset(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, 0.0F, false);

		flap3 = new ModelRenderer(this);
		flap3.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(flap3);
		setRotationAngle(flap3, 2.8362F, 0.0873F, 3.1416F);
		flap3.setTextureOffset(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, 0.0F, false);

		flap4 = new ModelRenderer(this);
		flap4.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(flap4);
		setRotationAngle(flap4, -0.3054F, 1.4835F, 0.0F);
		flap4.setTextureOffset(0, 122).addBox(-3.0F, -0.5374F, -9.0053F, 6.0F, 5.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -57.0F, 0.0F);
		all.addChild(head);
		head.setTextureOffset(56, 0).addBox(-9.0F, -6.0F, -9.0F, 18.0F, 6.0F, 18.0F, 0.0F, false);
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
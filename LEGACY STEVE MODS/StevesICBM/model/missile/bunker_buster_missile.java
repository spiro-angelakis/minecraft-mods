// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class bunker_buster_missile extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer mouth;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer tube1;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer mouth_flap1;
	private final ModelRenderer mouth_flap2;
	private final ModelRenderer mouth_flap3;
	private final ModelRenderer mouth_flap4;
	private final ModelRenderer tube2;
	private final ModelRenderer hexadecagon_r9;
	private final ModelRenderer hexadecagon_r10;
	private final ModelRenderer hexadecagon_r11;
	private final ModelRenderer hexadecagon_r12;
	private final ModelRenderer tube1_flap1;
	private final ModelRenderer tube1_flap2;
	private final ModelRenderer tube1_flap3;
	private final ModelRenderer tube1_flap4;
	private final ModelRenderer tube2_flap1;
	private final ModelRenderer tube2_flap2;
	private final ModelRenderer tube2_flap3;
	private final ModelRenderer tube2_flap4;
	private final ModelRenderer tip;
	private final ModelRenderer hexadecagon_r13;
	private final ModelRenderer hexadecagon_r14;
	private final ModelRenderer hexadecagon_r15;
	private final ModelRenderer hexadecagon_r16;

	public bunker_buster_missile() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 22.0F, 0.0F);
		

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(8.0F, 6.0F, -8.0F);
		all.addChild(mouth);
		mouth.setTextureOffset(46, 0).addBox(-8.7956F, -10.0F, 4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(46, 0).addBox(-12.0F, -10.0F, 7.2044F, 8.0F, 4.0F, 1.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-8.0F, -8.0F, 8.0F);
		mouth.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(46, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-8.0F, -8.0F, 8.0F);
		mouth.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(46, 0).addBox(-4.0F, -2.0F, -0.7956F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-8.0F, -8.0F, 8.0F);
		mouth.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-8.0F, -8.0F, 8.0F);
		mouth.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(46, 0).addBox(-0.7956F, -2.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		tube1 = new ModelRenderer(this);
		tube1.setRotationPoint(8.0F, -20.0F, -8.0F);
		all.addChild(tube1);
		tube1.setTextureOffset(0, 0).addBox(-9.1935F, -32.0F, 2.0F, 2.0F, 48.0F, 12.0F, 0.0F, false);
		tube1.setTextureOffset(0, 0).addBox(-14.0F, -32.0F, 6.8065F, 12.0F, 48.0F, 2.0F, 0.0F, false);

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube1.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r5.setTextureOffset(0, 0).addBox(-6.0F, -24.0F, -1.1935F, 12.0F, 48.0F, 2.0F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.0F, 48.0F, 12.0F, 0.0F, false);

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube1.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r6.setTextureOffset(0, 0).addBox(-6.0F, -24.0F, -1.1935F, 12.0F, 48.0F, 2.0F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.0F, 48.0F, 12.0F, 0.0F, false);

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube1.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r7.setTextureOffset(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.0F, 48.0F, 12.0F, 0.0F, false);

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube1.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r8.setTextureOffset(0, 0).addBox(-1.1935F, -24.0F, -6.0F, 2.0F, 48.0F, 12.0F, 0.0F, false);

		mouth_flap1 = new ModelRenderer(this);
		mouth_flap1.setRotationPoint(0.0F, 2.0F, 0.0F);
		all.addChild(mouth_flap1);
		setRotationAngle(mouth_flap1, -0.5236F, 0.0F, 0.0F);
		mouth_flap1.setTextureOffset(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		mouth_flap2 = new ModelRenderer(this);
		mouth_flap2.setRotationPoint(0.0F, 2.0F, 0.0F);
		all.addChild(mouth_flap2);
		setRotationAngle(mouth_flap2, 0.0F, -1.5708F, -0.5236F);
		mouth_flap2.setTextureOffset(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		mouth_flap3 = new ModelRenderer(this);
		mouth_flap3.setRotationPoint(0.0F, 2.0F, 0.0F);
		all.addChild(mouth_flap3);
		setRotationAngle(mouth_flap3, 2.618F, 0.0F, -3.1416F);
		mouth_flap3.setTextureOffset(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		mouth_flap4 = new ModelRenderer(this);
		mouth_flap4.setRotationPoint(0.0F, 2.0F, 0.0F);
		all.addChild(mouth_flap4);
		setRotationAngle(mouth_flap4, 0.0F, 1.5708F, 0.5236F);
		mouth_flap4.setTextureOffset(54, 10).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		tube2 = new ModelRenderer(this);
		tube2.setRotationPoint(8.0F, -50.0F, -8.0F);
		all.addChild(tube2);
		tube2.setTextureOffset(0, 28).addBox(-8.5967F, -14.0F, 5.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		tube2.setTextureOffset(0, 28).addBox(-11.0F, -14.0F, 7.4033F, 6.0F, 12.0F, 1.0F, 0.0F, false);

		hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube2.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r9.setTextureOffset(0, 28).addBox(-3.0F, -6.0F, -0.5967F, 6.0F, 12.0F, 1.0F, 0.0F, false);
		hexadecagon_r9.setTextureOffset(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);

		hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube2.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r10.setTextureOffset(0, 28).addBox(-3.0F, -6.0F, -0.5967F, 6.0F, 12.0F, 1.0F, 0.0F, false);
		hexadecagon_r10.setTextureOffset(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);

		hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube2.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r11.setTextureOffset(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);

		hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tube2.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r12.setTextureOffset(0, 28).addBox(-0.5967F, -6.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);

		tube1_flap1 = new ModelRenderer(this);
		tube1_flap1.setRotationPoint(0.0F, -10.0F, 0.0F);
		all.addChild(tube1_flap1);
		setRotationAngle(tube1_flap1, 0.0F, 0.0F, 0.3927F);
		tube1_flap1.setTextureOffset(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, 0.0F, false);

		tube1_flap2 = new ModelRenderer(this);
		tube1_flap2.setRotationPoint(0.0F, -10.0F, 0.0F);
		all.addChild(tube1_flap2);
		setRotationAngle(tube1_flap2, 1.5708F, 1.1781F, 1.5708F);
		tube1_flap2.setTextureOffset(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, 0.0F, false);

		tube1_flap3 = new ModelRenderer(this);
		tube1_flap3.setRotationPoint(0.0F, -10.0F, 0.0F);
		all.addChild(tube1_flap3);
		setRotationAngle(tube1_flap3, -3.1416F, 0.0F, 2.7489F);
		tube1_flap3.setTextureOffset(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, 0.0F, false);

		tube1_flap4 = new ModelRenderer(this);
		tube1_flap4.setRotationPoint(0.0F, -10.0F, 0.0F);
		all.addChild(tube1_flap4);
		setRotationAngle(tube1_flap4, -1.5708F, -1.1781F, 1.5708F);
		tube1_flap4.setTextureOffset(46, 46).addBox(-11.0F, -12.0F, 0.0F, 8.0F, 17.0F, 1.0F, 0.0F, false);

		tube2_flap1 = new ModelRenderer(this);
		tube2_flap1.setRotationPoint(0.0F, -56.0F, 0.0F);
		all.addChild(tube2_flap1);
		setRotationAngle(tube2_flap1, -1.5708F, -1.1781F, 1.5708F);
		tube2_flap1.setTextureOffset(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, 0.0F, false);

		tube2_flap2 = new ModelRenderer(this);
		tube2_flap2.setRotationPoint(0.0F, -56.0F, 0.0F);
		all.addChild(tube2_flap2);
		setRotationAngle(tube2_flap2, -3.1416F, 0.0F, 2.7489F);
		tube2_flap2.setTextureOffset(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, 0.0F, false);

		tube2_flap3 = new ModelRenderer(this);
		tube2_flap3.setRotationPoint(0.0F, -56.0F, 0.0F);
		all.addChild(tube2_flap3);
		setRotationAngle(tube2_flap3, 1.5708F, 1.1781F, 1.5708F);
		tube2_flap3.setTextureOffset(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, 0.0F, false);

		tube2_flap4 = new ModelRenderer(this);
		tube2_flap4.setRotationPoint(0.0F, -56.0F, 0.0F);
		all.addChild(tube2_flap4);
		setRotationAngle(tube2_flap4, 0.0F, 0.0F, 0.3927F);
		tube2_flap4.setTextureOffset(46, 46).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 11.0F, 1.0F, 0.0F, false);

		tip = new ModelRenderer(this);
		tip.setRotationPoint(8.0F, -60.0F, -8.0F);
		all.addChild(tip);
		tip.setTextureOffset(56, 27).addBox(-8.3978F, -12.0F, 6.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);
		tip.setTextureOffset(56, 27).addBox(-10.0F, -12.0F, 7.6022F, 4.0F, 8.0F, 0.0F, 0.0F, false);

		hexadecagon_r13 = new ModelRenderer(this);
		hexadecagon_r13.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tip.addChild(hexadecagon_r13);
		setRotationAngle(hexadecagon_r13, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r13.setTextureOffset(56, 27).addBox(-2.0F, -4.0F, -0.3978F, 4.0F, 8.0F, 0.0F, 0.0F, false);
		hexadecagon_r13.setTextureOffset(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);

		hexadecagon_r14 = new ModelRenderer(this);
		hexadecagon_r14.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tip.addChild(hexadecagon_r14);
		setRotationAngle(hexadecagon_r14, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r14.setTextureOffset(56, 27).addBox(-2.0F, -4.0F, -0.3978F, 4.0F, 8.0F, 0.0F, 0.0F, false);
		hexadecagon_r14.setTextureOffset(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);

		hexadecagon_r15 = new ModelRenderer(this);
		hexadecagon_r15.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tip.addChild(hexadecagon_r15);
		setRotationAngle(hexadecagon_r15, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r15.setTextureOffset(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);

		hexadecagon_r16 = new ModelRenderer(this);
		hexadecagon_r16.setRotationPoint(-8.0F, -8.0F, 8.0F);
		tip.addChild(hexadecagon_r16);
		setRotationAngle(hexadecagon_r16, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r16.setTextureOffset(56, 27).addBox(-0.3978F, -4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F, false);
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
// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class terrier2 extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer tip;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer cap;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer hexadecagon2;
	private final ModelRenderer hexadecagon_r9;
	private final ModelRenderer hexadecagon_r10;
	private final ModelRenderer hexadecagon_r11;
	private final ModelRenderer hexadecagon_r12;
	private final ModelRenderer body;
	private final ModelRenderer hexadecagon_r13;
	private final ModelRenderer hexadecagon_r14;
	private final ModelRenderer hexadecagon_r15;
	private final ModelRenderer hexadecagon_r16;
	private final ModelRenderer fins_top;
	private final ModelRenderer hexadecagon_r17;
	private final ModelRenderer fins_bottom;
	private final ModelRenderer hexadecagon_r18;
	private final ModelRenderer thruster;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public terrier2() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 20.0F, 0.0F);
		

		tip = new ModelRenderer(this);
		tip.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(tip);
		

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-0.3656F, -44.1669F, 0.0F);
		tip.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.3491F, 0.0F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 0).addBox(-1.1344F, -2.607F, 1.9535F, 3.0F, 7.0F, 1.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-0.3656F, -44.1669F, 0.0F);
		tip.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, -0.3491F, 0.0F, 0.0F);
		hexadecagon_r2.setTextureOffset(46, 0).addBox(-1.1344F, -2.607F, -2.9535F, 3.0F, 7.0F, 1.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(3.5F, -44.0F, -0.2956F);
		tip.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, 0.0F, -0.3491F);
		hexadecagon_r3.setTextureOffset(36, 49).addBox(-1.5F, -4.0F, -1.2044F, 1.0F, 7.0F, 3.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-3.5F, -44.0F, -0.2956F);
		tip.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.0F, 0.3491F);
		hexadecagon_r4.setTextureOffset(36, 59).addBox(0.5F, -4.0F, -1.2044F, 1.0F, 7.0F, 3.0F, 0.0F, false);

		cap = new ModelRenderer(this);
		cap.setRotationPoint(8.0F, -42.0F, -8.0F);
		tip.addChild(cap);
		cap.setTextureOffset(82, 65).addBox(-8.5967F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cap.setTextureOffset(82, 45).addBox(-8.5967F, -1.0F, 9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cap.setTextureOffset(86, 28).addBox(-7.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cap.setTextureOffset(36, 85).addBox(-11.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(-8.0F, 0.0F, 8.0F);
		cap.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r5.setTextureOffset(70, 84).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(76, 85).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(82, 41).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(82, 61).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(-8.0F, 0.0F, 8.0F);
		cap.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r6.setTextureOffset(85, 36).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(86, 39).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(82, 49).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(82, 69).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(-8.0F, 0.0F, 8.0F);
		cap.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r7.setTextureOffset(36, 81).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r7.setTextureOffset(82, 57).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(-8.0F, 0.0F, 8.0F);
		cap.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r8.setTextureOffset(82, 53).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r8.setTextureOffset(82, 73).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		hexadecagon2 = new ModelRenderer(this);
		hexadecagon2.setRotationPoint(0.0F, -1.0F, 0.0F);
		cap.addChild(hexadecagon2);
		hexadecagon2.setTextureOffset(36, 77).addBox(-8.5967F, -1.0F, 5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon2.setTextureOffset(36, 69).addBox(-8.5967F, -1.0F, 9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon2.setTextureOffset(81, 83).addBox(-7.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon2.setTextureOffset(83, 0).addBox(-11.0F, -1.0F, 7.4033F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(-8.0F, 0.0F, 8.0F);
		hexadecagon2.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r9.setTextureOffset(82, 80).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r9.setTextureOffset(83, 33).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r9.setTextureOffset(56, 42).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r9.setTextureOffset(40, 75).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(-8.0F, 0.0F, 8.0F);
		hexadecagon2.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r10.setTextureOffset(83, 4).addBox(-3.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r10.setTextureOffset(64, 84).addBox(1.0F, -1.0F, -0.5967F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		hexadecagon_r10.setTextureOffset(40, 71).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r10.setTextureOffset(40, 79).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(-8.0F, 0.0F, 8.0F);
		hexadecagon2.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r11.setTextureOffset(10, 52).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r11.setTextureOffset(74, 37).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(-8.0F, 0.0F, 8.0F);
		hexadecagon2.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r12.setTextureOffset(36, 73).addBox(-0.5967F, -1.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		hexadecagon_r12.setTextureOffset(80, 37).addBox(-0.5967F, -1.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(8.0F, -8.0F, -8.0F);
		all.addChild(body);
		body.setTextureOffset(36, 0).addBox(-8.7956F, -33.0F, 4.0F, 1.0F, 41.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(56, 0).addBox(-12.0F, -33.0F, 7.2044F, 8.0F, 41.0F, 1.0F, 0.0F, false);

		hexadecagon_r13 = new ModelRenderer(this);
		hexadecagon_r13.setRotationPoint(-8.0F, 0.0F, 8.0F);
		body.addChild(hexadecagon_r13);
		setRotationAngle(hexadecagon_r13, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r13.setTextureOffset(18, 49).addBox(-4.0F, -33.0F, -0.7956F, 8.0F, 41.0F, 1.0F, 0.0F, false);
		hexadecagon_r13.setTextureOffset(18, 0).addBox(-0.7956F, -33.0F, -4.0F, 1.0F, 41.0F, 8.0F, 0.0F, false);

		hexadecagon_r14 = new ModelRenderer(this);
		hexadecagon_r14.setRotationPoint(-8.0F, 0.0F, 8.0F);
		body.addChild(hexadecagon_r14);
		setRotationAngle(hexadecagon_r14, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r14.setTextureOffset(64, 42).addBox(-4.0F, -33.0F, -0.7956F, 8.0F, 41.0F, 1.0F, 0.0F, false);
		hexadecagon_r14.setTextureOffset(46, 41).addBox(-0.7956F, -33.0F, -4.0F, 1.0F, 41.0F, 8.0F, 0.0F, false);

		hexadecagon_r15 = new ModelRenderer(this);
		hexadecagon_r15.setRotationPoint(-8.0F, 0.0F, 8.0F);
		body.addChild(hexadecagon_r15);
		setRotationAngle(hexadecagon_r15, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r15.setTextureOffset(0, 0).addBox(-0.7956F, -33.0F, -4.0F, 1.0F, 41.0F, 8.0F, 0.0F, false);

		hexadecagon_r16 = new ModelRenderer(this);
		hexadecagon_r16.setRotationPoint(-8.0F, 0.0F, 8.0F);
		body.addChild(hexadecagon_r16);
		setRotationAngle(hexadecagon_r16, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r16.setTextureOffset(0, 49).addBox(-0.7956F, -33.0F, -4.0F, 1.0F, 41.0F, 8.0F, 0.0F, false);

		fins_top = new ModelRenderer(this);
		fins_top.setRotationPoint(0.0F, -38.0F, 0.0F);
		all.addChild(fins_top);
		fins_top.setTextureOffset(10, 0).addBox(-8.0F, -2.0F, 0.2044F, 6.0F, 5.0F, 0.0F, 0.0F, false);
		fins_top.setTextureOffset(10, 0).addBox(2.0F, -2.0F, 0.2044F, 6.0F, 5.0F, 0.0F, 0.0F, true);
		fins_top.setTextureOffset(74, 22).addBox(0.2044F, -2.0F, 2.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);

		hexadecagon_r17 = new ModelRenderer(this);
		hexadecagon_r17.setRotationPoint(0.2044F, 0.5F, -5.0F);
		fins_top.addChild(hexadecagon_r17);
		setRotationAngle(hexadecagon_r17, -3.1416F, 0.0F, 3.1416F);
		hexadecagon_r17.setTextureOffset(74, 22).addBox(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);

		fins_bottom = new ModelRenderer(this);
		fins_bottom.setRotationPoint(0.0F, -8.0F, 0.0F);
		all.addChild(fins_bottom);
		fins_bottom.setTextureOffset(74, 18).addBox(-9.0F, -2.0F, 0.2044F, 8.0F, 10.0F, 0.0F, 0.0F, false);
		fins_bottom.setTextureOffset(74, 18).addBox(1.0F, -2.0F, 0.2044F, 8.0F, 10.0F, 0.0F, 0.0F, true);
		fins_bottom.setTextureOffset(74, 0).addBox(0.2044F, -2.0F, 1.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);

		hexadecagon_r18 = new ModelRenderer(this);
		hexadecagon_r18.setRotationPoint(0.2044F, 3.0F, -5.0F);
		fins_bottom.addChild(hexadecagon_r18);
		setRotationAngle(hexadecagon_r18, -3.1416F, 0.0F, 3.1416F);
		hexadecagon_r18.setTextureOffset(74, 0).addBox(0.0F, -5.0F, -4.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);

		thruster = new ModelRenderer(this);
		thruster.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(thruster);
		thruster.setTextureOffset(0, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		thruster.setTextureOffset(28, 4).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.5F, 0.0F);
		thruster.addChild(cube_r1);
		setRotationAngle(cube_r1, -2.2253F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(74, 0).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 1.5F, 0.0F);
		thruster.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.2253F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(74, 4).addBox(-1.5F, -1.5F, 0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.5F, 0.0F);
		thruster.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -2.2253F);
		cube_r3.setTextureOffset(28, 0).addBox(0.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 1.5F, 0.0F);
		thruster.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 2.2253F);
		cube_r4.setTextureOffset(74, 33).addBox(-3.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
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
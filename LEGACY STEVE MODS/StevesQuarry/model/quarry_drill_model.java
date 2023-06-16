// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class quarry_drill_model extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer cap;
	private final ModelRenderer drill;
	private final ModelRenderer rot1_bit;
	private final ModelRenderer drillbit1;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer drillbit3;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer drillbit5;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer rot2_bit;
	private final ModelRenderer drillbit2;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer drillbit4;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer drillbit6;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer tip;
	private final ModelRenderer cube_r1;

	public quarry_drill_model() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cap = new ModelRenderer(this);
		cap.setRotationPoint(0.0F, -16.0F, 0.0F);
		all.addChild(cap);
		cap.setTextureOffset(0, 0).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 3.0F, 14.0F, 0.0F, false);
		cap.setTextureOffset(0, 0).addBox(7.0F, 2.0F, -7.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);
		cap.setTextureOffset(0, 0).addBox(-7.0F, 2.0F, 7.0F, 14.0F, 2.0F, 1.0F, 0.0F, false);
		cap.setTextureOffset(0, 0).addBox(-8.0F, 2.0F, -7.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);
		cap.setTextureOffset(0, 0).addBox(-7.0F, 2.0F, -8.0F, 14.0F, 2.0F, 1.0F, 0.0F, false);

		drill = new ModelRenderer(this);
		drill.setRotationPoint(0.0F, -13.0F, 0.0F);
		all.addChild(drill);
		drill.setTextureOffset(0, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		drill.setTextureOffset(0, 20).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		drill.setTextureOffset(0, 20).addBox(-5.0F, 2.0F, -4.0F, 10.0F, 1.0F, 8.0F, 0.0F, false);

		rot1_bit = new ModelRenderer(this);
		rot1_bit.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill.addChild(rot1_bit);
		

		drillbit1 = new ModelRenderer(this);
		drillbit1.setRotationPoint(0.0F, 4.0F, 0.0F);
		rot1_bit.addChild(drillbit1);
		drillbit1.setTextureOffset(0, 20).addBox(-2.4853F, -1.0F, -6.0F, 4.0F, 2.0F, 12.0F, 0.0F, false);
		drillbit1.setTextureOffset(0, 20).addBox(-6.0F, -1.0F, -2.4853F, 12.0F, 2.0F, 4.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit1.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(0, 20).addBox(-6.0F, -1.0F, -2.4853F, 12.0F, 2.0F, 4.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 20).addBox(-2.4853F, -1.0F, -6.0F, 4.0F, 2.0F, 12.0F, 0.0F, false);

		drillbit3 = new ModelRenderer(this);
		drillbit3.setRotationPoint(0.0F, 7.5F, 0.0F);
		rot1_bit.addChild(drillbit3);
		drillbit3.setTextureOffset(0, 20).addBox(-0.7956F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		drillbit3.setTextureOffset(0, 20).addBox(-4.0F, -0.5F, -0.7956F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit3.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 20).addBox(-4.0F, -0.5F, -0.7956F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		hexadecagon_r1.setTextureOffset(0, 20).addBox(-0.7956F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit3.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r2.setTextureOffset(0, 20).addBox(-4.0F, -0.5F, -0.7956F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		hexadecagon_r2.setTextureOffset(0, 20).addBox(-0.7956F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit3.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r3.setTextureOffset(0, 20).addBox(-0.7956F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit3.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r4.setTextureOffset(0, 20).addBox(-0.7956F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		drillbit5 = new ModelRenderer(this);
		drillbit5.setRotationPoint(0.0F, 9.5F, 0.0F);
		rot1_bit.addChild(drillbit5);
		drillbit5.setTextureOffset(0, 20).addBox(-0.3978F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		drillbit5.setTextureOffset(0, 20).addBox(-2.0F, -0.5F, -0.3978F, 4.0F, 1.0F, 0.0F, 0.0F, false);

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit5.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
		hexadecagon_r5.setTextureOffset(0, 20).addBox(-2.0F, -0.5F, -0.3978F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		hexadecagon_r5.setTextureOffset(0, 20).addBox(-0.3978F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit5.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
		hexadecagon_r6.setTextureOffset(0, 20).addBox(-2.0F, -0.5F, -0.3978F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		hexadecagon_r6.setTextureOffset(0, 20).addBox(-0.3978F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit5.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
		hexadecagon_r7.setTextureOffset(0, 20).addBox(-0.3978F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit5.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
		hexadecagon_r8.setTextureOffset(0, 20).addBox(-0.3978F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, false);

		rot2_bit = new ModelRenderer(this);
		rot2_bit.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill.addChild(rot2_bit);
		

		drillbit2 = new ModelRenderer(this);
		drillbit2.setRotationPoint(0.0F, 6.0F, 0.0F);
		rot2_bit.addChild(drillbit2);
		setRotationAngle(drillbit2, 0.0F, -1.1781F, 0.0F);
		drillbit2.setTextureOffset(0, 20).addBox(-2.0711F, -1.0F, -5.0F, 4.0F, 2.0F, 10.0F, 0.0F, false);
		drillbit2.setTextureOffset(0, 20).addBox(-5.0F, -1.0F, -2.0711F, 10.0F, 2.0F, 4.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit2.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(0, 20).addBox(-5.0F, -1.0F, -2.0711F, 10.0F, 2.0F, 4.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 20).addBox(-2.0711F, -1.0F, -5.0F, 4.0F, 2.0F, 10.0F, 0.0F, false);

		drillbit4 = new ModelRenderer(this);
		drillbit4.setRotationPoint(0.0F, 8.5F, 0.0F);
		rot2_bit.addChild(drillbit4);
		drillbit4.setTextureOffset(0, 20).addBox(-1.2426F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		drillbit4.setTextureOffset(0, 20).addBox(-3.0F, -0.5F, -1.2426F, 6.0F, 1.0F, 2.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit4.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
		octagon_r3.setTextureOffset(0, 20).addBox(-3.0F, -0.5F, -1.2426F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		octagon_r3.setTextureOffset(0, 20).addBox(-1.2426F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		drillbit6 = new ModelRenderer(this);
		drillbit6.setRotationPoint(0.0F, 10.5F, 0.0F);
		rot2_bit.addChild(drillbit6);
		drillbit6.setTextureOffset(0, 20).addBox(-0.6213F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		drillbit6.setTextureOffset(0, 20).addBox(-1.5F, -0.5F, -0.6213F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit6.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, -0.7854F, 0.0F);
		octagon_r4.setTextureOffset(0, 20).addBox(-1.5F, -0.5F, -0.6213F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		octagon_r4.setTextureOffset(0, 20).addBox(-0.6213F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		tip = new ModelRenderer(this);
		tip.setRotationPoint(0.0F, 0.0F, 0.0F);
		drillbit6.addChild(tip);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.75F, -0.1F, -0.5F);
		tip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5355F, 0.4718F, -0.6537F);
		cube_r1.setTextureOffset(0, 39).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class spudnik_downward2 extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer tube;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer cone1;
	private final ModelRenderer cone2;
	private final ModelRenderer cone3;
	private final ModelRenderer cone4;
	private final ModelRenderer cone8;
	private final ModelRenderer cone7;
	private final ModelRenderer cone6;
	private final ModelRenderer cone5;
	private final ModelRenderer bone;
	private final ModelRenderer base;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer cap;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer lid;
	private final ModelRenderer octagon_r4;

	public spudnik_downward2() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, -21.0F, 0.0F);
		setRotationAngle(all, 0.0F, 0.0F, 3.1416F);
		

		tube = new ModelRenderer(this);
		tube.setRotationPoint(0.0F, -25.0F, 0.0F);
		all.addChild(tube);
		setRotationAngle(tube, 0.0F, 0.0F, 1.5708F);
		tube.setTextureOffset(0, 30).addBox(-12.5F, -2.0711F, -5.0F, 33.0F, 4.0F, 1.0F, 0.0F, false);
		tube.setTextureOffset(0, 20).addBox(-12.5F, -2.0711F, 4.0F, 33.0F, 4.0F, 1.0F, 0.0F, false);
		tube.setTextureOffset(0, 10).addBox(-12.5F, 4.0F, -2.0711F, 33.0F, 1.0F, 4.0F, 0.0F, false);
		tube.setTextureOffset(0, 0).addBox(-12.5F, -5.0F, -2.0711F, 33.0F, 1.0F, 4.0F, 0.0F, false);
		tube.setTextureOffset(0, 40).addBox(20.0F, -4.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube.addChild(octagon_r1);
		setRotationAngle(octagon_r1, -0.7854F, 0.0F, 0.0F);
		octagon_r1.setTextureOffset(0, 5).addBox(-12.5F, -5.0F, -2.0711F, 33.0F, 1.0F, 4.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 15).addBox(-12.5F, 4.0F, -2.0711F, 33.0F, 1.0F, 4.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 25).addBox(-12.5F, -2.0711F, 4.0F, 33.0F, 4.0F, 1.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 35).addBox(-12.5F, -2.0711F, -5.0F, 33.0F, 4.0F, 1.0F, 0.0F, false);

		cone1 = new ModelRenderer(this);
		cone1.setRotationPoint(-16.4F, -4.0F, -2.0F);
		tube.addChild(cone1);
		setRotationAngle(cone1, 0.0F, 0.0F, -0.3927F);
		cone1.setTextureOffset(42, 45).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.0F, 0.0F, false);

		cone2 = new ModelRenderer(this);
		cone2.setRotationPoint(-16.4F, 4.0F, 2.0F);
		tube.addChild(cone2);
		setRotationAngle(cone2, 3.1174F, 0.01F, 0.3926F);
		cone2.setTextureOffset(18, 45).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.0F, 0.0F, false);

		cone3 = new ModelRenderer(this);
		cone3.setRotationPoint(-16.4F, 2.0F, -4.0F);
		tube.addChild(cone3);
		setRotationAngle(cone3, 1.5802F, 0.3927F, 0.0036F);
		cone3.setTextureOffset(34, 40).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.0F, 0.0F, false);

		cone4 = new ModelRenderer(this);
		cone4.setRotationPoint(-16.4F, -2.0F, 3.9F);
		tube.addChild(cone4);
		setRotationAngle(cone4, -1.5141F, -0.3921F, -0.0217F);
		cone4.setTextureOffset(10, 40).addBox(-3.8045F, 0.5307F, -0.0711F, 8.0F, 1.0F, 4.0F, 0.0F, false);

		cone8 = new ModelRenderer(this);
		cone8.setRotationPoint(-16.4F, -4.0F, -2.0F);
		tube.addChild(cone8);
		setRotationAngle(cone8, 0.0F, 0.0F, -0.3927F);
		cone8.setTextureOffset(29, 54).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		cone7 = new ModelRenderer(this);
		cone7.setRotationPoint(-16.4F, 4.0F, 2.0F);
		tube.addChild(cone7);
		setRotationAngle(cone7, 3.1174F, 0.01F, 0.3926F);
		cone7.setTextureOffset(39, 55).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		cone6 = new ModelRenderer(this);
		cone6.setRotationPoint(-16.4F, 2.0F, -4.0F);
		tube.addChild(cone6);
		setRotationAngle(cone6, 1.5802F, 0.3927F, 0.0036F);
		cone6.setTextureOffset(53, 55).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		cone5 = new ModelRenderer(this);
		cone5.setRotationPoint(-16.4F, -2.0F, 3.9F);
		tube.addChild(cone5);
		setRotationAngle(cone5, -1.5141F, -0.3921F, -0.0217F);
		cone5.setTextureOffset(0, 56).addBox(34.4552F, 14.3073F, -0.0711F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube.addChild(bone);
		

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, -7.0F, 0.0F);
		all.addChild(base);
		setRotationAngle(base, 0.0F, 0.0F, 1.5708F);
		base.setTextureOffset(63, 55).addBox(3.0F, -1.0355F, -2.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		base.setTextureOffset(62, 44).addBox(3.0F, -1.0355F, 1.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		base.setTextureOffset(0, 61).addBox(3.0F, 1.5F, -1.0355F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		base.setTextureOffset(10, 45).addBox(3.0F, -2.5F, -1.0355F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(octagon_r2);
		setRotationAngle(octagon_r2, -0.7854F, 0.0F, 0.0F);
		octagon_r2.setTextureOffset(56, 60).addBox(3.0F, -2.5F, -1.0355F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		octagon_r2.setTextureOffset(10, 62).addBox(3.0F, 1.5F, -1.0355F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		octagon_r2.setTextureOffset(55, 63).addBox(3.0F, -1.0355F, 1.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 64).addBox(3.0F, -1.0355F, -2.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		cap = new ModelRenderer(this);
		cap.setRotationPoint(0.0F, -38.7F, 0.0F);
		all.addChild(cap);
		setRotationAngle(cap, 0.0F, 0.0F, 1.5708F);
		cap.setTextureOffset(28, 60).addBox(-1.0F, -1.6569F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		cap.setTextureOffset(54, 40).addBox(-1.0F, -1.6569F, 3.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		cap.setTextureOffset(51, 51).addBox(-1.0F, 3.0F, -1.6569F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		cap.setTextureOffset(18, 50).addBox(-1.0F, -4.0F, -1.6569F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cap.addChild(octagon_r3);
		setRotationAngle(octagon_r3, -0.7854F, 0.0F, 0.0F);
		octagon_r3.setTextureOffset(36, 50).addBox(-1.0F, -4.0F, -1.6569F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		octagon_r3.setTextureOffset(15, 54).addBox(-1.0F, 3.0F, -1.6569F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		octagon_r3.setTextureOffset(14, 58).addBox(-1.0F, -1.6569F, 3.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		octagon_r3.setTextureOffset(42, 60).addBox(-1.0F, -1.6569F, -4.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);

		lid = new ModelRenderer(this);
		lid.setRotationPoint(0.0F, -44.7F, 0.0F);
		all.addChild(lid);
		setRotationAngle(lid, 0.0F, 0.0F, 1.5708F);
		lid.setTextureOffset(22, 62).addBox(3.0F, -1.2426F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		lid.setTextureOffset(33, 50).addBox(3.0F, -1.2426F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		lid.setTextureOffset(0, 43).addBox(3.0F, 2.0F, -1.2426F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		lid.setTextureOffset(0, 40).addBox(3.0F, -3.0F, -1.2426F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		lid.addChild(octagon_r4);
		setRotationAngle(octagon_r4, -0.7854F, 0.0F, 0.0F);
		octagon_r4.setTextureOffset(30, 40).addBox(3.0F, -3.0F, -1.2426F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		octagon_r4.setTextureOffset(38, 45).addBox(3.0F, 2.0F, -1.2426F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		octagon_r4.setTextureOffset(49, 55).addBox(3.0F, -1.2426F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		octagon_r4.setTextureOffset(27, 64).addBox(3.0F, -1.2426F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
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
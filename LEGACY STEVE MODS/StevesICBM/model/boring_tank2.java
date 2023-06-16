// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class boring_tank2 extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer car;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer drill;
	private final ModelRenderer drill_stem;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer drill_bit1;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer drill_bit2;
	private final ModelRenderer octagon_r5;
	private final ModelRenderer drill_bit3;
	private final ModelRenderer octagon_r6;
	private final ModelRenderer drill_bit4;
	private final ModelRenderer octagon_r7;
	private final ModelRenderer drill_bit5;
	private final ModelRenderer octagon_r8;
	private final ModelRenderer wheel1;
	private final ModelRenderer octagon_r9;
	private final ModelRenderer wheel2;
	private final ModelRenderer octagon_r10;
	private final ModelRenderer wheel3;
	private final ModelRenderer octagon_r11;
	private final ModelRenderer wheel4;
	private final ModelRenderer octagon_r12;

	public boring_tank2() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		car = new ModelRenderer(this);
		car.setRotationPoint(0.0F, -10.0F, 0.0F);
		all.addChild(car);
		car.setTextureOffset(0, 24).addBox(-3.3137F, 0.0F, -16.0F, 6.0F, 8.0F, 32.0F, 0.0F, false);
		car.setTextureOffset(0, 24).addBox(-3.3137F, -7.0F, -16.0F, 6.0F, 7.0F, 8.0F, 0.0F, false);
		car.setTextureOffset(0, 24).addBox(-8.3137F, -9.0F, 8.0F, 17.0F, 9.0F, 9.0F, 0.0F, false);
		car.setTextureOffset(0, 24).addBox(-8.0F, -3.3137F, -16.0F, 16.0F, 6.0F, 32.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		car.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, 0.0F, 0.7854F);
		octagon_r1.setTextureOffset(0, 24).addBox(2.0F, -3.3137F, -16.0F, 6.0F, 6.0F, 32.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 24).addBox(-3.3137F, 2.0F, -16.0F, 6.0F, 6.0F, 32.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		car.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, 0.0F, 1.5708F);
		octagon_r2.setTextureOffset(0, 24).addBox(-7.6863F, 3.0F, -16.0F, 5.0F, 5.0F, 32.0F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 24).addBox(-7.6863F, -8.0F, -16.0F, 5.0F, 5.0F, 32.0F, 0.0F, false);

		drill = new ModelRenderer(this);
		drill.setRotationPoint(0.0F, -12.0F, -16.0F);
		all.addChild(drill);
		

		drill_stem = new ModelRenderer(this);
		drill_stem.setRotationPoint(0.0F, 0.0F, -1.0F);
		drill.addChild(drill_stem);
		drill_stem.setTextureOffset(0, 0).addBox(-0.8284F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		drill_stem.setTextureOffset(0, 0).addBox(-2.0F, -0.8284F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill_stem.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, 0.0F, 0.7854F);
		octagon_r3.setTextureOffset(0, 0).addBox(-2.0F, -0.8284F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		octagon_r3.setTextureOffset(0, 0).addBox(-0.8284F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		drill_bit1 = new ModelRenderer(this);
		drill_bit1.setRotationPoint(0.0F, 0.0F, -3.0F);
		drill.addChild(drill_bit1);
		drill_bit1.setTextureOffset(0, 0).addBox(-4.9706F, -12.0F, -1.0F, 9.0F, 24.0F, 2.0F, 0.0F, false);
		drill_bit1.setTextureOffset(0, 0).addBox(-12.0F, -4.9706F, -1.0F, 24.0F, 9.0F, 2.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill_bit1.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, 0.0F, 0.7854F);
		octagon_r4.setTextureOffset(0, 0).addBox(-12.0F, -4.9706F, -1.0F, 24.0F, 9.0F, 2.0F, 0.0F, false);
		octagon_r4.setTextureOffset(0, 0).addBox(-4.9706F, -12.0F, -1.0F, 9.0F, 24.0F, 2.0F, 0.0F, false);

		drill_bit2 = new ModelRenderer(this);
		drill_bit2.setRotationPoint(0.0F, 0.0F, -5.0F);
		drill.addChild(drill_bit2);
		drill_bit2.setTextureOffset(0, 0).addBox(-3.9706F, -10.0F, -1.0F, 8.0F, 21.0F, 2.0F, 0.0F, false);
		drill_bit2.setTextureOffset(0, 0).addBox(-11.0F, -3.0294F, -1.0F, 22.0F, 7.0F, 2.0F, 0.0F, false);

		octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill_bit2.addChild(octagon_r5);
		setRotationAngle(octagon_r5, 0.0F, 0.0F, 0.7854F);
		octagon_r5.setTextureOffset(0, 0).addBox(-11.0F, -3.0294F, -1.0F, 22.0F, 7.0F, 2.0F, 0.0F, false);
		octagon_r5.setTextureOffset(0, 0).addBox(-3.9706F, -10.0F, -1.0F, 8.0F, 21.0F, 2.0F, 0.0F, false);

		drill_bit3 = new ModelRenderer(this);
		drill_bit3.setRotationPoint(0.0F, 0.0F, -7.0F);
		drill.addChild(drill_bit3);
		setRotationAngle(drill_bit3, 0.0F, 0.0F, 0.3927F);
		drill_bit3.setTextureOffset(0, 0).addBox(-2.9706F, -9.0F, -1.0F, 6.0F, 19.0F, 2.0F, 0.0F, false);
		drill_bit3.setTextureOffset(0, 0).addBox(-10.0F, -2.0294F, -1.0F, 20.0F, 5.0F, 2.0F, 0.0F, false);

		octagon_r6 = new ModelRenderer(this);
		octagon_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill_bit3.addChild(octagon_r6);
		setRotationAngle(octagon_r6, 0.0F, 0.0F, 0.7854F);
		octagon_r6.setTextureOffset(0, 0).addBox(-10.0F, -2.0294F, -1.0F, 20.0F, 5.0F, 2.0F, 0.0F, false);
		octagon_r6.setTextureOffset(0, 0).addBox(-2.9706F, -9.0F, -1.0F, 6.0F, 19.0F, 2.0F, 0.0F, false);

		drill_bit4 = new ModelRenderer(this);
		drill_bit4.setRotationPoint(0.0F, 0.0F, -9.0F);
		drill.addChild(drill_bit4);
		drill_bit4.setTextureOffset(0, 0).addBox(-1.9706F, -8.0F, -1.0F, 4.0F, 17.0F, 2.0F, 0.0F, false);
		drill_bit4.setTextureOffset(0, 0).addBox(-9.0F, -1.0294F, -1.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);

		octagon_r7 = new ModelRenderer(this);
		octagon_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill_bit4.addChild(octagon_r7);
		setRotationAngle(octagon_r7, 0.0F, 0.0F, 0.7854F);
		octagon_r7.setTextureOffset(0, 0).addBox(-9.0F, -1.0294F, -1.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);
		octagon_r7.setTextureOffset(0, 0).addBox(-1.9706F, -8.0F, -1.0F, 4.0F, 17.0F, 2.0F, 0.0F, false);

		drill_bit5 = new ModelRenderer(this);
		drill_bit5.setRotationPoint(0.0F, 0.0F, -11.0F);
		drill.addChild(drill_bit5);
		setRotationAngle(drill_bit5, 0.0F, 0.0F, -0.3927F);
		drill_bit5.setTextureOffset(0, 0).addBox(-0.9706F, -7.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);
		drill_bit5.setTextureOffset(0, 0).addBox(-8.0F, -0.0294F, -1.0F, 16.0F, 1.0F, 2.0F, 0.0F, false);

		octagon_r8 = new ModelRenderer(this);
		octagon_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		drill_bit5.addChild(octagon_r8);
		setRotationAngle(octagon_r8, 0.0F, 0.0F, 0.7854F);
		octagon_r8.setTextureOffset(0, 0).addBox(-8.0F, -0.0294F, -1.0F, 16.0F, 1.0F, 2.0F, 0.0F, false);
		octagon_r8.setTextureOffset(0, 0).addBox(-0.9706F, -7.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);

		wheel1 = new ModelRenderer(this);
		wheel1.setRotationPoint(-12.0F, -8.0F, 10.0F);
		all.addChild(wheel1);
		wheel1.setTextureOffset(16, 22).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);
		wheel1.setTextureOffset(16, 22).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);

		octagon_r9 = new ModelRenderer(this);
		octagon_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		wheel1.addChild(octagon_r9);
		setRotationAngle(octagon_r9, -0.7854F, 0.0F, 0.0F);
		octagon_r9.setTextureOffset(16, 22).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);
		octagon_r9.setTextureOffset(16, 22).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);

		wheel2 = new ModelRenderer(this);
		wheel2.setRotationPoint(-12.0F, -8.0F, -9.0F);
		all.addChild(wheel2);
		wheel2.setTextureOffset(16, 21).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);
		wheel2.setTextureOffset(16, 21).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);

		octagon_r10 = new ModelRenderer(this);
		octagon_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		wheel2.addChild(octagon_r10);
		setRotationAngle(octagon_r10, -0.7854F, 0.0F, 0.0F);
		octagon_r10.setTextureOffset(16, 21).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);
		octagon_r10.setTextureOffset(16, 21).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);

		wheel3 = new ModelRenderer(this);
		wheel3.setRotationPoint(12.0F, -8.0F, -9.0F);
		all.addChild(wheel3);
		wheel3.setTextureOffset(16, 22).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);
		wheel3.setTextureOffset(16, 22).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);

		octagon_r11 = new ModelRenderer(this);
		octagon_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		wheel3.addChild(octagon_r11);
		setRotationAngle(octagon_r11, -0.7854F, 0.0F, 0.0F);
		octagon_r11.setTextureOffset(16, 22).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);
		octagon_r11.setTextureOffset(16, 22).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);

		wheel4 = new ModelRenderer(this);
		wheel4.setRotationPoint(12.0F, -8.0F, 10.0F);
		all.addChild(wheel4);
		wheel4.setTextureOffset(16, 22).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);
		wheel4.setTextureOffset(16, 22).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);

		octagon_r12 = new ModelRenderer(this);
		octagon_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		wheel4.addChild(octagon_r12);
		setRotationAngle(octagon_r12, -0.7854F, 0.0F, 0.0F);
		octagon_r12.setTextureOffset(16, 22).addBox(-4.0F, -8.0F, -3.3137F, 8.0F, 16.0F, 6.0F, 0.0F, false);
		octagon_r12.setTextureOffset(16, 22).addBox(-4.0F, -3.3137F, -8.0F, 8.0F, 6.0F, 16.0F, 0.0F, false);
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
// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class hog extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer nose;
	private final ModelRenderer body;
	private final ModelRenderer arms;
	private final ModelRenderer arms_rotation;
	private final ModelRenderer arms_flipped;
	private final ModelRenderer arms_rotation2;
	private final ModelRenderer arms_flipped2;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public hog() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-7.0F, -8.0F, -4.0F, 14.0F, 8.0F, 8.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, -2.0F, 0.0F);
		nose.setTextureOffset(24, 0).addBox(-2.0F, -1.0F, -6.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, false);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 3.5F, 0.3F);
		

		arms_rotation = new ModelRenderer(this);
		arms_rotation.setRotationPoint(0.0F, -2.0F, 0.05F);
		arms.addChild(arms_rotation);
		setRotationAngle(arms_rotation, -0.5323F, 0.0F, 0.0F);
		arms_rotation.setTextureOffset(44, 22).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		arms_rotation.setTextureOffset(40, 38).addBox(-4.0F, 4.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);

		arms_flipped = new ModelRenderer(this);
		arms_flipped.setRotationPoint(0.0F, 24.0F, 0.0F);
		arms_rotation.addChild(arms_flipped);
		arms_flipped.setTextureOffset(44, 22).addBox(4.0F, -24.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		arms_rotation2 = new ModelRenderer(this);
		arms_rotation2.setRotationPoint(0.0F, -2.0F, 0.05F);
		arms.addChild(arms_rotation2);
		setRotationAngle(arms_rotation2, -0.5323F, 0.0F, 0.0F);
		arms_rotation2.setTextureOffset(44, 22).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		arms_rotation2.setTextureOffset(40, 38).addBox(-4.0F, 4.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);

		arms_flipped2 = new ModelRenderer(this);
		arms_flipped2.setRotationPoint(0.0F, 24.0F, 0.0F);
		arms_rotation2.addChild(arms_flipped2);
		arms_flipped2.setTextureOffset(44, 22).addBox(4.0F, -24.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(40, 46).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(40, 46).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		left_leg.setTextureOffset(0, 22).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
		right_leg.setTextureOffset(34, 25).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		hat.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		arms.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
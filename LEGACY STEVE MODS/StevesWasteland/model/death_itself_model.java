// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class death_itself_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_rotation;
	private final ModelRenderer body;
	private final ModelRenderer mane;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_right_leg;

	public death_itself_model() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 3.0F, -8.5F);
		

		head_rotation = new ModelRenderer(this);
		head_rotation.setRotationPoint(0.0F, -12.0F, 3.0F);
		head.addChild(head_rotation);
		setRotationAngle(head_rotation, -0.0436F, 0.0F, 0.0F);
		head_rotation.setTextureOffset(61, 1).addBox(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F, 0.0F, false);
		head_rotation.setTextureOffset(120, 51).addBox(6.0F, -9.0F, -13.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		head_rotation.setTextureOffset(120, 51).addBox(-8.0F, -9.0F, -13.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 2.0F, 4.5F);
		setRotationAngle(body, -0.7418F, 0.0F, 0.0F);
		body.setTextureOffset(1, 1).addBox(-8.0F, -7.0F, -1.0F, 16.0F, 14.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(1, 1).addBox(-10.0F, -9.0F, -15.0F, 20.0F, 16.0F, 14.0F, 0.0F, false);

		mane = new ModelRenderer(this);
		mane.setRotationPoint(0.0F, -11.4F, 13.5F);
		setRotationAngle(mane, -0.6545F, 0.0F, 0.0F);
		mane.setTextureOffset(90, 35).addBox(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, 0.0F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(4.0F, -7.0F, -4.75F);
		front_left_leg.setTextureOffset(41, 42).addBox(5.0F, 0.0F, -2.75F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(-5.0F, -7.0F, -4.5F);
		front_right_leg.setTextureOffset(66, 42).addBox(-11.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-2.5F, 13.0F, 9.0F);
		back_left_leg.setTextureOffset(0, 45).addBox(6.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(2.5F, 13.0F, 8.0F);
		back_right_leg.setTextureOffset(21, 45).addBox(-11.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		mane.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
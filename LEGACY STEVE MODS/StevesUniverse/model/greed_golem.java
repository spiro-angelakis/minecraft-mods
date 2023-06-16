// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class greed_golem extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public greed_golem() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -31.0F, 0.0F);
		all.addChild(body);
		body.setTextureOffset(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F, false);
		body.setTextureOffset(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -33.0F, -2.0F);
		all.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-1.0F, -3.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-9.0F, -31.0F, 0.0F);
		all.addChild(right_arm);
		right_arm.setTextureOffset(60, 21).addBox(-4.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(9.0F, -31.0F, 0.0F);
		all.addChild(left_arm);
		left_arm.setTextureOffset(60, 58).addBox(0.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-5.0F, -16.0F, 0.0F);
		all.addChild(right_leg);
		right_leg.setTextureOffset(37, 0).addBox(-2.5F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, -16.0F, 0.0F);
		all.addChild(left_leg);
		left_leg.setTextureOffset(60, 0).addBox(-2.5F, 0.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
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
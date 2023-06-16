// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class bighorn_baby extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_left_leg;

	public bighorn_baby() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(body);
		body.setTextureOffset(0, 0).addBox(-8.0F, -14.0F, -8.0F, 16.0F, 11.0F, 16.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -10.0F, -8.0F);
		body.addChild(head);
		head.setTextureOffset(42, 54).addBox(-3.0F, -1.0F, -5.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 52).addBox(-4.0F, -1.5F, -15.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		head.setTextureOffset(0, 52).addBox(3.0F, -1.5F, -15.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(-6.0F, -4.0F, -6.0F);
		body.addChild(front_right_leg);
		front_right_leg.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(6.0F, -4.0F, -6.0F);
		body.addChild(front_left_leg);
		front_left_leg.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(-6.0F, -4.0F, 5.0F);
		body.addChild(back_right_leg);
		back_right_leg.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(5.0F, -4.0F, 6.0F);
		body.addChild(back_left_leg);
		back_left_leg.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
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
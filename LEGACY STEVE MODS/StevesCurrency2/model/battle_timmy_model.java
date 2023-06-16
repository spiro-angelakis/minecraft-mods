// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class battle_timmy_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;
	private final ModelRenderer stick_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer head;

	public battle_timmy_model() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, -3.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, -4.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, -4.0F, 0.0F);
		body.addChild(left_leg);
		left_leg.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -9.0F, -2.0F);
		body.addChild(right_arm);
		

		stick_r1 = new ModelRenderer(this);
		stick_r1.setRotationPoint(0.0F, 3.4F, -3.8F);
		right_arm.addChild(stick_r1);
		setRotationAngle(stick_r1, 0.7854F, 0.0F, 0.0F);
		stick_r1.setTextureOffset(28, 25).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
		right_arm.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, -9.0F, -2.0F);
		body.addChild(left_arm);
		left_arm.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.0F, -2.0F);
		body.addChild(head);
		head.setTextureOffset(18, 25).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
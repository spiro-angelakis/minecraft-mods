// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class hogman_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;

	public hogman_model() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -14.0F, 8.3F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -3.0F, -3.0F, 7, 7, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 44, -1.5F, -0.3F, -4.8F, 3, 3, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 26, 0, 2.5F, -0.7F, -1.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 26, 0, -4.5F, -0.9F, -1.0F, 2, 2, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0F, 13.8F, 8.0F);
		setRotationAngle(body, -1.7453F, 0.0F, 0.0F);
		

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(-2.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		rotation.cubeList.add(new ModelBox(rotation, 0, 19, -7.0F, -13.0F, -7.0F, 14, 14, 11, 0.0F, false));

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 5.0F);
		rotation.addChild(body_sub_1);
		setRotationAngle(body_sub_1, 0.2618F, 0.0F, 0.0F);
		body_sub_1.cubeList.add(new ModelBox(body_sub_1, 39, 0, -6.0F, -25.0F, -7.0F, 12, 12, 10, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.5F, 14.0F, 6.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 50, 22, -1.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F, false));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.5F, 14.0F, 6.0F);
		right_leg.cubeList.add(new ModelBox(right_leg, 50, 22, -2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(8.1F, -10.0F, 9.0F);
		left_arm.cubeList.add(new ModelBox(left_arm, 50, 40, -2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F, false));

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-8.0F, -10.0F, 9.0F);
		right_arm.cubeList.add(new ModelBox(right_arm, 50, 40, -2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		left_leg.render(f5);
		right_leg.render(f5);
		left_arm.render(f5);
		right_arm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
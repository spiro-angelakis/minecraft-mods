// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class zombie_fatty extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public zombie_fatty() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 16, -6.0F, 3.0F, -6.0F, 12, 2, 10, 0.0F, false));

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 0.4F, -0.4F);
		head.addChild(headwear);
		setRotationAngle(headwear, -0.1309F, 0.0F, 0.0F);
		headwear.cubeList.add(new ModelBox(headwear, 32, 0, -5.0F, -4.0257F, -3.6084F, 10, 6, 8, 0.25F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 1.5F, 2.0F);
		setRotationAngle(body, -0.1745F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -6.0F, 2.9544F, -1.4791F, 12, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, 5.9544F, -5.4791F, 7, 8, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 0.0F, 5.9544F, -5.4791F, 7, 8, 8, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		left_arm.cubeList.add(new ModelBox(left_arm, 40, 16, 1.0F, 1.0F, -2.0F, 4, 8, 4, 0.0F, true));

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		right_arm.cubeList.add(new ModelBox(right_arm, 40, 16, -5.0F, 1.0F, -2.0F, 4, 8, 4, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.1F, 12.0F, 0.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 16, -1.1F, 3.0F, -2.0F, 5, 9, 4, 0.0F, true));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.1F, 12.0F, 0.0F);
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 16, -3.9F, 3.0F, -2.0F, 5, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		left_arm.render(f5);
		right_arm.render(f5);
		left_leg.render(f5);
		right_leg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
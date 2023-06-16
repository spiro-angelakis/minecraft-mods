// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class radroach_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer head;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg2;
	private final ModelRenderer left_leg3;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg2;
	private final ModelRenderer right_leg3;

	public radroach_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 2.0F);
		

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotation.addChild(body_sub_1);
		body_sub_1.cubeList.add(new ModelBox(body_sub_1, 28, 8, -5.0F, -10.0F, -7.0F, 10, 16, 8, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.0F, -6.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, 0.0F, -10.0F, 8, 7, 8, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(7.0F, 18.0F, -7.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(7.0F, 18.0F, -1.0F);
		left_leg2.cubeList.add(new ModelBox(left_leg2, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		left_leg3 = new ModelRenderer(this);
		left_leg3.setRotationPoint(7.0F, 18.0F, 5.0F);
		left_leg3.cubeList.add(new ModelBox(left_leg3, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-7.0F, 18.0F, -7.0F);
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(-7.0F, 18.0F, -1.0F);
		right_leg2.cubeList.add(new ModelBox(right_leg2, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		right_leg3 = new ModelRenderer(this);
		right_leg3.setRotationPoint(-7.0F, 18.0F, 5.0F);
		right_leg3.cubeList.add(new ModelBox(right_leg3, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		left_leg.render(f5);
		left_leg2.render(f5);
		left_leg3.render(f5);
		right_leg.render(f5);
		right_leg2.render(f5);
		right_leg3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
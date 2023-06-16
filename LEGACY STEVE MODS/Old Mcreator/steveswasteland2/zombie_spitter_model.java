// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class zombie_spitter_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer upper_head;
	private final ModelRenderer headwear;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public zombie_spitter_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, 0.0F, -6.0F, 8, 3, 8, 0.0F, false));

		upper_head = new ModelRenderer(this);
		upper_head.setRotationPoint(0.0F, 6.0F, -1.0F);
		head.addChild(upper_head);
		setRotationAngle(upper_head, -0.3927F, 0.0F, 0.0F);
		upper_head.cubeList.add(new ModelBox(upper_head, 0, 0, -4.0F, -9.0F, -6.0F, 8, 5, 8, 0.0F, false));
		upper_head.cubeList.add(new ModelBox(upper_head, 0, 0, -4.0F, -4.0F, -4.0F, 8, 3, 8, 0.0F, false));

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 8.0F, 0.0F);
		head.addChild(headwear);
		setRotationAngle(headwear, 0.3054F, 0.0F, 0.0F);
		headwear.cubeList.add(new ModelBox(headwear, 32, 0, -4.0F, -2.0F, -6.0F, 8, 2, 8, 0.25F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.1F, 12.0F, 0.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 16, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.1F, 12.0F, 0.0F);
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 16, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		left_leg.render(f5);
		right_leg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class termite_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer Head;
	private final ModelRenderer left_pincher;
	private final ModelRenderer right_pincher;
	private final ModelRenderer left_leg1;
	private final ModelRenderer left_leg2;
	private final ModelRenderer left_leg3;
	private final ModelRenderer right_leg1;
	private final ModelRenderer right_leg2;
	private final ModelRenderer right_leg3;

	public termite_model() {
		textureWidth = 16;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 22.0F, 2.0F);
		body.cubeList.add(new ModelBox(body, 0, 6, -2.0F, -2.0F, -4.0F, 4, 2, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 2, -1.0F, -1.0F, 2.0F, 2, 1, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 22.0F, -3.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 2, -1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F, false));

		left_pincher = new ModelRenderer(this);
		left_pincher.setRotationPoint(1.0F, -1.0F, -1.0F);
		Head.addChild(left_pincher);
		left_pincher.cubeList.add(new ModelBox(left_pincher, 0, 2, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		right_pincher = new ModelRenderer(this);
		right_pincher.setRotationPoint(1.0F, -1.0F, -1.0F);
		Head.addChild(right_pincher);
		right_pincher.cubeList.add(new ModelBox(right_pincher, 0, 2, -2.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		left_leg1 = new ModelRenderer(this);
		left_leg1.setRotationPoint(3.0F, 22.0F, -2.0F);
		left_leg1.cubeList.add(new ModelBox(left_leg1, 0, 1, -1.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(3.0F, 22.0F, 0.0F);
		left_leg2.cubeList.add(new ModelBox(left_leg2, 0, 1, -1.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));

		left_leg3 = new ModelRenderer(this);
		left_leg3.setRotationPoint(3.0F, 22.0F, 2.0F);
		left_leg3.cubeList.add(new ModelBox(left_leg3, 0, 1, -1.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));

		right_leg1 = new ModelRenderer(this);
		right_leg1.setRotationPoint(-2.0F, 22.0F, -2.0F);
		right_leg1.cubeList.add(new ModelBox(right_leg1, 0, 1, -1.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(-2.0F, 22.0F, 0.0F);
		right_leg2.cubeList.add(new ModelBox(right_leg2, 0, 1, -1.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));

		right_leg3 = new ModelRenderer(this);
		right_leg3.setRotationPoint(-2.0F, 22.0F, 2.0F);
		right_leg3.cubeList.add(new ModelBox(right_leg3, 0, 1, -1.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		Head.render(f5);
		left_leg1.render(f5);
		left_leg2.render(f5);
		left_leg3.render(f5);
		right_leg1.render(f5);
		right_leg2.render(f5);
		right_leg3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
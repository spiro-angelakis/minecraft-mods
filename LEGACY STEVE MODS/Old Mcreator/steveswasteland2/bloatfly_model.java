// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class bloatfly_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer right_wing;
	private final ModelRenderer outer_right_wing;
	private final ModelRenderer left_wing;
	private final ModelRenderer outer_left_wing;

	public bloatfly_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, -4.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F, false));

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(0.0F, 27.0F, -2.0F);
		head.addChild(right_ear);
		right_ear.cubeList.add(new ModelBox(right_ear, 0, 57, -4.0F, -29.0F, -4.0F, 3, 4, 3, 0.0F, false));
		right_ear.cubeList.add(new ModelBox(right_ear, 0, 57, 1.0F, -29.0F, -4.0F, 3, 4, 3, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -8.0F, 4.0F, -3.0F, 16, 16, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 34, -5.0F, 20.0F, 1.0F, 10, 1, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 16, 23, -7.0F, 5.0F, -12.0F, 14, 14, 9, 0.0F, false));

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-5.0F, 0.0F, 0.0F);
		right_wing.cubeList.add(new ModelBox(right_wing, 42, 0, -12.0F, 1.0F, 1.5F, 10, 16, 1, 0.0F, false));

		outer_right_wing = new ModelRenderer(this);
		outer_right_wing.setRotationPoint(12.0F, 1.0F, 1.5F);
		right_wing.addChild(outer_right_wing);
		outer_right_wing.cubeList.add(new ModelBox(outer_right_wing, 24, 16, -32.0F, 1.0F, 0.0F, 8, 12, 1, 0.0F, false));

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(5.0F, 0.0F, 0.0F);
		left_wing.cubeList.add(new ModelBox(left_wing, 42, 0, 2.0F, 1.0F, 1.5F, 10, 16, 1, 0.0F, true));

		outer_left_wing = new ModelRenderer(this);
		outer_left_wing.setRotationPoint(-12.0F, 1.0F, 1.5F);
		left_wing.addChild(outer_left_wing);
		outer_left_wing.cubeList.add(new ModelBox(outer_left_wing, 24, 16, 24.0F, 1.0F, 0.0F, 8, 12, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		right_wing.render(f5);
		left_wing.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
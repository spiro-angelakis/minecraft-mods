// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class deathclaw_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer jaw;
	private final ModelRenderer body;
	private final ModelRenderer spine;
	private final ModelRenderer front_left_arm;
	private final ModelRenderer front_left_shin;
	private final ModelRenderer front_left_foot;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_left_shin;
	private final ModelRenderer back_left_foot;
	private final ModelRenderer front_right_arm;
	private final ModelRenderer front_right_shin;
	private final ModelRenderer front_right_foot;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_right_shin;
	private final ModelRenderer back_right_foot;

	public deathclaw_model() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -55.0F, -14.0F);
		setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 176, 44, -6.0F, -1.0F, -24.0F, 12, 5, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 112, 30, -8.0F, -8.0F, -10.0F, 16, 16, 16, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 93, 233, 5.0F, -26.0F, 0.0F, 4, 18, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 87, 233, -10.0F, -26.0F, 0.0F, 4, 18, 6, 0.0F, false));

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 4.0F, -8.0F);
		head.addChild(jaw);
		setRotationAngle(jaw, 0.5236F, 0.0F, 0.0F);
		jaw.cubeList.add(new ModelBox(jaw, 176, 65, -6.0F, 0.0F, -16.0F, 12, 4, 16, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -57.0F, 2.0F);
		setRotationAngle(body, -1.2654F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -13.0F, 0.0F, 9.0F, 27, 19, 39, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 189, 52, -10.0F, -6.0F, 10.0F, 22, 6, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 189, 53, -10.0F, -6.0F, 24.0F, 22, 6, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 189, 53, -10.0F, -6.0F, 39.0F, 22, 6, 12, 0.0F, false));

		spine = new ModelRenderer(this);
		spine.setRotationPoint(0.0F, 9.0F, 5.0F);
		body.addChild(spine);
		spine.cubeList.add(new ModelBox(spine, 192, 104, -9.0F, -5.0F, -5.0F, 19, 10, 10, 0.0F, false));
		spine.cubeList.add(new ModelBox(spine, 48, 0, -5.0F, -9.0F, -3.0F, 11, 4, 6, 0.0F, false));

		front_left_arm = new ModelRenderer(this);
		front_left_arm.setRotationPoint(14.0F, -51.0F, -2.0F);
		front_left_arm.cubeList.add(new ModelBox(front_left_arm, 112, 104, 0.0F, -4.0F, -4.0F, 13, 19, 8, 0.0F, false));

		front_left_shin = new ModelRenderer(this);
		front_left_shin.setRotationPoint(-20.0F, 16.0F, 0.0F);
		front_left_arm.addChild(front_left_shin);
		front_left_shin.cubeList.add(new ModelBox(front_left_shin, 226, 138, 21.0F, -1.0F, -3.0F, 6, 16, 6, 0.0F, false));

		front_left_foot = new ModelRenderer(this);
		front_left_foot.setRotationPoint(1.0F, 15.0F, 0.0F);
		front_left_shin.addChild(front_left_foot);
		setRotationAngle(front_left_foot, 1.1345F, 0.0F, 0.0F);
		front_left_foot.cubeList.add(new ModelBox(front_left_foot, 144, 104, 19.0F, 0.0F, -12.0F, 8, 4, 16, 0.0F, false));

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(20.0F, -12.0F, 11.0F);
		back_left_leg.cubeList.add(new ModelBox(back_left_leg, 0, 0, -8.0F, 0.0F, -8.0F, 16, 18, 16, 0.0F, false));

		back_left_shin = new ModelRenderer(this);
		back_left_shin.setRotationPoint(-32.0F, 20.0F, -6.0F);
		back_left_leg.addChild(back_left_shin);
		back_left_shin.cubeList.add(new ModelBox(back_left_shin, 196, 0, 26.0F, -2.0F, 0.0F, 12, 12, 12, 0.0F, false));

		back_left_foot = new ModelRenderer(this);
		back_left_foot.setRotationPoint(0.0F, 10.0F, 8.0F);
		back_left_shin.addChild(back_left_foot);
		back_left_foot.cubeList.add(new ModelBox(back_left_foot, 112, 0, 28.0F, 0.0F, -20.0F, 13, 6, 24, 0.0F, false));

		front_right_arm = new ModelRenderer(this);
		front_right_arm.setRotationPoint(-10.0F, -51.0F, -1.0F);
		front_right_arm.cubeList.add(new ModelBox(front_right_arm, 112, 104, -16.0F, -4.0F, -4.0F, 13, 20, 8, 0.0F, false));

		front_right_shin = new ModelRenderer(this);
		front_right_shin.setRotationPoint(17.0F, 16.0F, 0.0F);
		front_right_arm.addChild(front_right_shin);
		front_right_shin.cubeList.add(new ModelBox(front_right_shin, 226, 138, -27.0F, -1.0F, -3.0F, 6, 15, 6, 0.0F, false));

		front_right_foot = new ModelRenderer(this);
		front_right_foot.setRotationPoint(0.0F, 14.0F, 0.0F);
		front_right_shin.addChild(front_right_foot);
		setRotationAngle(front_right_foot, 0.6981F, 0.0F, 0.0F);
		front_right_foot.cubeList.add(new ModelBox(front_right_foot, 144, 104, -28.0F, 0.0F, -12.0F, 8, 4, 16, 0.0F, false));

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(-19.0F, -12.0F, 11.0F);
		back_right_leg.cubeList.add(new ModelBox(back_right_leg, 0, 0, -8.0F, 1.0F, -8.0F, 16, 17, 16, 0.0F, false));

		back_right_shin = new ModelRenderer(this);
		back_right_shin.setRotationPoint(32.0F, 20.0F, -6.0F);
		back_right_leg.addChild(back_right_shin);
		back_right_shin.cubeList.add(new ModelBox(back_right_shin, 196, 0, -38.0F, -2.0F, 0.0F, 12, 11, 12, 0.0F, false));

		back_right_foot = new ModelRenderer(this);
		back_right_foot.setRotationPoint(0.0F, 9.0F, 8.0F);
		back_right_shin.addChild(back_right_foot);
		back_right_foot.cubeList.add(new ModelBox(back_right_foot, 112, 0, -41.0F, 0.0F, -20.0F, 12, 6, 24, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		front_left_arm.render(f5);
		back_left_leg.render(f5);
		front_right_arm.render(f5);
		back_right_leg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
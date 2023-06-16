// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class bighorn_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer head;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public bighorn_model() {
		textureWidth = 128;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 2.0F);
		

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		rotation.cubeList.add(new ModelBox(rotation, 47, 22, -10.0F, -19.0F, -7.0F, 20, 25, 15, 1.75F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -8.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -4.0F, -17.0F, 6, 6, 6, 0.6F, false));
		head.cubeList.add(new ModelBox(head, 0, 41, -5.0F, -6.0F, -36.0F, 2, 2, 19, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -6.0F, -36.0F, 2, 2, 19, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-6.0F, 12.0F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(6.0F, 12.0F, 7.0F);
		leg2.cubeList.add(new ModelBox(leg2, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-6.0F, 12.0F, -15.0F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 16, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(5.0F, 12.0F, -15.0F);
		leg4.cubeList.add(new ModelBox(leg4, 0, 16, -1.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
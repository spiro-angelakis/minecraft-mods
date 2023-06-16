// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class jumpship_model extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer warp_ring;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer ship;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer thrusters;
	private final ModelRenderer thruster;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer thruster_cap;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer thruster4;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer thruster_cap4;
	private final ModelRenderer octagon_r5;
	private final ModelRenderer thruster3;
	private final ModelRenderer octagon_r6;
	private final ModelRenderer thruster_cap3;
	private final ModelRenderer octagon_r7;
	private final ModelRenderer thruster2;
	private final ModelRenderer octagon_r8;
	private final ModelRenderer thruster_cap2;
	private final ModelRenderer octagon_r9;

	public jumpship_model() {
		textureWidth = 256;
		textureHeight = 256;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, -20.0F, 2.0F);
		

		warp_ring = new ModelRenderer(this);
		warp_ring.setRotationPoint(0.0F, -23.0F, 0.0F);
		all.addChild(warp_ring);
		warp_ring.setTextureOffset(0, 0).addBox(-26.5097F, 63.0F, -32.0F, 53.0F, 1.0F, 64.0F, 0.0F, false);
		warp_ring.setTextureOffset(0, 0).addBox(-26.5097F, -64.0F, -32.0F, 53.0F, 1.0F, 64.0F, 0.0F, false);
		warp_ring.setTextureOffset(0, 0).addBox(63.0F, -26.5097F, -32.0F, 1.0F, 53.0F, 64.0F, 0.0F, false);
		warp_ring.setTextureOffset(0, 0).addBox(-64.0F, -26.5097F, -32.0F, 1.0F, 53.0F, 64.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		warp_ring.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, 0.0F, 0.7854F);
		octagon_r1.setTextureOffset(0, 0).addBox(-64.0F, -26.5097F, -32.0F, 1.0F, 53.0F, 64.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 0).addBox(63.0F, -26.5097F, -32.0F, 1.0F, 53.0F, 64.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 0).addBox(-26.5097F, -64.0F, -32.0F, 53.0F, 1.0F, 64.0F, 0.0F, false);
		octagon_r1.setTextureOffset(0, 0).addBox(-26.5097F, 63.0F, -32.0F, 53.0F, 1.0F, 64.0F, 0.0F, false);

		ship = new ModelRenderer(this);
		ship.setRotationPoint(0.0F, -17.0F, -8.0F);
		all.addChild(ship);
		ship.setTextureOffset(0, 0).addBox(-27.0F, -30.0F, -53.0F, 57.0F, 30.0F, 100.0F, 0.0F, false);
		ship.setTextureOffset(0, 0).addBox(-31.0F, -30.0F, 47.0F, 66.0F, 64.0F, 19.0F, 0.0F, false);
		ship.setTextureOffset(0, 0).addBox(-12.0F, 0.0F, -28.0F, 28.0F, 30.0F, 75.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -8.25F, -47.0F);
		ship.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5272F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -56.0F, -12.0F, 5.0F, 52.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -15.25F, -42.0F);
		ship.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.2689F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-3.0F, -25.0F, -14.0F, 9.0F, 21.0F, 11.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -24.25F, -42.0F);
		ship.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.2689F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 210).addBox(-28.0F, -25.0F, -14.0F, 59.0F, 21.0F, 25.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 13.0F, -27.0F);
		ship.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-27.0F, -25.0F, -14.0F, 57.0F, 38.0F, 25.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.0F, 21.0F, 0.0F);
		ship.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.setTextureOffset(0, 0).addBox(-12.0F, -21.0F, -28.0F, 28.0F, 21.0F, 75.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(4.0F, 20.0F, 0.0F);
		ship.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.6981F);
		cube_r6.setTextureOffset(0, 0).addBox(-12.0F, -21.0F, -28.0F, 28.0F, 21.0F, 75.0F, 0.0F, false);

		thrusters = new ModelRenderer(this);
		thrusters.setRotationPoint(0.0F, 44.0F, -33.0F);
		all.addChild(thrusters);
		

		thruster = new ModelRenderer(this);
		thruster.setRotationPoint(-15.0F, -43.0F, 98.0F);
		thrusters.addChild(thruster);
		thruster.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);
		thruster.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, 0.0F, 0.7854F);
		octagon_r2.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);
		octagon_r2.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);

		thruster_cap = new ModelRenderer(this);
		thruster_cap.setRotationPoint(0.0F, 0.0F, 11.0F);
		thruster.addChild(thruster_cap);
		thruster_cap.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		thruster_cap.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster_cap.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, 0.0F, 0.7854F);
		octagon_r3.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r3.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r3.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		octagon_r3.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);

		thruster4 = new ModelRenderer(this);
		thruster4.setRotationPoint(19.0F, -43.0F, 98.0F);
		thrusters.addChild(thruster4);
		thruster4.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);
		thruster4.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster4.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, 0.0F, 0.7854F);
		octagon_r4.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);
		octagon_r4.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);

		thruster_cap4 = new ModelRenderer(this);
		thruster_cap4.setRotationPoint(0.0F, 0.0F, 11.0F);
		thruster4.addChild(thruster_cap4);
		thruster_cap4.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap4.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap4.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		thruster_cap4.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);

		octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster_cap4.addChild(octagon_r5);
		setRotationAngle(octagon_r5, 0.0F, 0.0F, 0.7854F);
		octagon_r5.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r5.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r5.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		octagon_r5.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);

		thruster3 = new ModelRenderer(this);
		thruster3.setRotationPoint(-15.0F, -75.0F, 98.0F);
		thrusters.addChild(thruster3);
		thruster3.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);
		thruster3.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);

		octagon_r6 = new ModelRenderer(this);
		octagon_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster3.addChild(octagon_r6);
		setRotationAngle(octagon_r6, 0.0F, 0.0F, 0.7854F);
		octagon_r6.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);
		octagon_r6.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);

		thruster_cap3 = new ModelRenderer(this);
		thruster_cap3.setRotationPoint(0.0F, 0.0F, 11.0F);
		thruster3.addChild(thruster_cap3);
		thruster_cap3.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap3.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap3.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		thruster_cap3.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);

		octagon_r7 = new ModelRenderer(this);
		octagon_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster_cap3.addChild(octagon_r7);
		setRotationAngle(octagon_r7, 0.0F, 0.0F, 0.7854F);
		octagon_r7.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r7.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r7.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		octagon_r7.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);

		thruster2 = new ModelRenderer(this);
		thruster2.setRotationPoint(19.0F, -75.0F, 98.0F);
		thrusters.addChild(thruster2);
		thruster2.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);
		thruster2.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);

		octagon_r8 = new ModelRenderer(this);
		octagon_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster2.addChild(octagon_r8);
		setRotationAngle(octagon_r8, 0.0F, 0.0F, 0.7854F);
		octagon_r8.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.0F, 16.0F, 0.0F, false);
		octagon_r8.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -8.0F, 13.0F, 32.0F, 16.0F, 0.0F, false);

		thruster_cap2 = new ModelRenderer(this);
		thruster_cap2.setRotationPoint(0.0F, 0.0F, 11.0F);
		thruster2.addChild(thruster_cap2);
		thruster_cap2.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap2.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		thruster_cap2.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		thruster_cap2.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);

		octagon_r9 = new ModelRenderer(this);
		octagon_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		thruster_cap2.addChild(octagon_r9);
		setRotationAngle(octagon_r9, 0.0F, 0.0F, 0.7854F);
		octagon_r9.setTextureOffset(160, 174).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r9.setTextureOffset(160, 174).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.0F, 8.0F, 0.0F, false);
		octagon_r9.setTextureOffset(160, 174).addBox(-6.6274F, -16.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
		octagon_r9.setTextureOffset(160, 174).addBox(-6.6274F, 15.0F, -4.0F, 13.0F, 1.0F, 8.0F, 0.0F, false);
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
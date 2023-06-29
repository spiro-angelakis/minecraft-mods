// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class moon_rocket2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "moon_rocket2"), "main");
	private final ModelPart all;

	public moon_rocket2(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition barrel_neck = all.addOrReplaceChild("barrel_neck", CubeListBuilder.create().texOffs(51, 0).addBox(-1.6569F, -2.0F, -4.0F, 3.3137F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(51, 0).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.3137F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.5F, 0.0F));

		PartDefinition octagon_r1 = barrel_neck.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(51, 0).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(51, 0).addBox(-1.6569F, -2.0F, -4.0F, 3.3137F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel = all.addOrReplaceChild("barrel", CubeListBuilder.create().texOffs(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.1826F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(49, 0).addBox(-8.0F, -2.0F, -1.5913F, 16.0F, 4.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition hexadecagon_r1 = barrel.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(49, 0).addBox(-8.0F, -2.0F, -1.5913F, 16.0F, 4.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.1826F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = barrel.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(49, 0).addBox(-8.0F, -2.0F, -1.5913F, 16.0F, 4.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.1826F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = barrel.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.1826F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = barrel.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(49, 0).addBox(-1.5913F, -2.0F, -8.0F, 3.1826F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tube1 = all.addOrReplaceChild("tube1", CubeListBuilder.create().texOffs(0, 144).addBox(-6.6274F, -40.0F, -16.0F, 13.2548F, 80.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(0, 144).addBox(-16.0F, -40.0F, -6.6274F, 32.0F, 80.0F, 13.2548F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -48.0F, 0.0F));

		PartDefinition octagon_r2 = tube1.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(0, 144).addBox(-16.0F, -40.0F, -6.6274F, 32.0F, 80.0F, 13.2548F, new CubeDeformation(0.0F))
		.texOffs(0, 144).addBox(-6.6274F, -40.0F, -16.0F, 13.2548F, 80.0F, 32.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube2 = all.addOrReplaceChild("tube2", CubeListBuilder.create().texOffs(0, 94).addBox(-5.799F, -10.0F, -14.0F, 11.598F, 20.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(0, 94).addBox(-14.0F, -10.0F, -5.799F, 28.0F, 20.0F, 11.598F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -97.0F, 0.0F));

		PartDefinition octagon_r3 = tube2.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(0, 94).addBox(-14.0F, -10.0F, -5.799F, 28.0F, 20.0F, 11.598F, new CubeDeformation(0.0F))
		.texOffs(0, 94).addBox(-5.799F, -10.0F, -14.0F, 11.598F, 20.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube3 = all.addOrReplaceChild("tube3", CubeListBuilder.create().texOffs(21, 72).addBox(-4.9706F, -9.0F, -12.0F, 9.9411F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(21, 72).addBox(-4.9706F, -9.0F, 9.0F, 9.9411F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(9.0F, -9.0F, -4.9706F, 3.0F, 18.0F, 9.9411F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-12.0F, -9.0F, -4.9706F, 3.0F, 18.0F, 9.9411F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -114.0F, 0.0F));

		PartDefinition octagon_r4 = tube3.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(0, 51).addBox(-12.0F, -9.0F, -4.9706F, 3.0F, 18.0F, 9.9411F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(9.0F, -9.0F, -4.9706F, 3.0F, 18.0F, 9.9411F, new CubeDeformation(0.0F))
		.texOffs(21, 72).addBox(-4.9706F, -9.0F, 9.0F, 9.9411F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(21, 72).addBox(-4.9706F, -9.0F, -12.0F, 9.9411F, 18.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube4 = all.addOrReplaceChild("tube4", CubeListBuilder.create().texOffs(0, 33).addBox(-4.1421F, -8.0F, -10.0F, 8.2843F, 16.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-10.0F, -8.0F, -4.1421F, 20.0F, 16.0F, 8.2843F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -129.0F, 0.0F));

		PartDefinition octagon_r5 = tube4.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(0, 33).addBox(-10.0F, -8.0F, -4.1421F, 20.0F, 16.0F, 8.2843F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-4.1421F, -8.0F, -10.0F, 8.2843F, 16.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tube5 = all.addOrReplaceChild("tube5", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3137F, -6.0F, -8.0F, 6.6274F, 12.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -6.0F, -3.3137F, 16.0F, 12.0F, 6.6274F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -142.0F, 0.0F));

		PartDefinition octagon_r6 = tube5.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -6.0F, -3.3137F, 16.0F, 12.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.3137F, -6.0F, -8.0F, 6.6274F, 12.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition fuel1 = all.addOrReplaceChild("fuel1", CubeListBuilder.create().texOffs(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.6274F, 90.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.6274F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -53.0F, -24.0F));

		PartDefinition octagon_r7 = fuel1.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.6274F, 90.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition fuel2 = all.addOrReplaceChild("fuel2", CubeListBuilder.create().texOffs(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.6274F, 90.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.6274F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -53.0F, 24.0F));

		PartDefinition octagon_r8 = fuel2.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(212, 0).addBox(-8.0F, -45.0F, -3.3137F, 16.0F, 90.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(212, 0).addBox(-3.3137F, -45.0F, -8.0F, 6.6274F, 90.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition fin1 = all.addOrReplaceChild("fin1", CubeListBuilder.create().texOffs(0, 206).addBox(-2.2011F, -18.7976F, 0.0F, 28.0F, 49.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -37.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition fin2 = all.addOrReplaceChild("fin2", CubeListBuilder.create().texOffs(0, 206).addBox(-2.2011F, -18.7976F, 0.0F, 28.0F, 49.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -37.0F, 0.0F, 3.1416F, 0.0F, -2.7489F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
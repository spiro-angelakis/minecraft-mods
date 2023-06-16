// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class haarp_missile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "haarp_missile"), "main");
	private final ModelPart all;

	public haarp_missile(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tube = all.addOrReplaceChild("tube", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -36.0F, -8.0F, 3.1826F, 40.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -36.0F, -1.5913F, 16.0F, 40.0F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition hexadecagon_r1 = tube.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 40.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 40.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = tube.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 40.0F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 40.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = tube.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 40.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = tube.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 40.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition barrel1 = all.addOrReplaceChild("barrel1", CubeListBuilder.create().texOffs(0, 59).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -2.0F, 2.0F));

		PartDefinition octagon_r1 = barrel1.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 59).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel2 = all.addOrReplaceChild("barrel2", CubeListBuilder.create().texOffs(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -2.0F, 2.0F));

		PartDefinition octagon_r2 = barrel2.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel3 = all.addOrReplaceChild("barrel3", CubeListBuilder.create().texOffs(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.0F));

		PartDefinition octagon_r3 = barrel3.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tip1 = all.addOrReplaceChild("tip1", CubeListBuilder.create().texOffs(84, 106).addBox(-3.3137F, -3.0F, -8.0F, 6.6274F, 6.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(84, 106).addBox(-8.0F, -3.0F, -3.3137F, 16.0F, 6.0F, 6.6274F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -47.0F, 0.0F));

		PartDefinition octagon_r4 = tip1.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(84, 106).addBox(-8.0F, -3.0F, -3.3137F, 16.0F, 6.0F, 6.6274F, new CubeDeformation(0.0F))
		.texOffs(84, 106).addBox(-3.3137F, -3.0F, -8.0F, 6.6274F, 6.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tip2 = all.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(106, 58).addBox(-1.6569F, -2.0F, -4.0F, 3.3137F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(106, 58).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.3137F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -52.0F, 0.0F));

		PartDefinition octagon_r5 = tip2.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(106, 58).addBox(-4.0F, -2.0F, -1.6569F, 8.0F, 4.0F, 3.3137F, new CubeDeformation(0.0F))
		.texOffs(106, 58).addBox(-1.6569F, -2.0F, -4.0F, 3.3137F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
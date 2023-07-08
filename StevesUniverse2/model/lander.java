// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class lander<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "lander"), "main");
	private final ModelPart all;

	public lander(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -5.0F, -9.0F, 18.0F, 2.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(38, 70).addBox(-9.0F, -38.0F, -9.0F, 18.0F, 33.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 20).addBox(-7.0F, -29.0F, -8.0F, 14.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(-9.0F, -38.0F, 8.0F, 18.0F, 33.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 20).addBox(-9.0F, -38.0F, -8.0F, 1.0F, 33.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(52, 53).addBox(-8.0F, -39.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(8.0F, -38.0F, -8.0F, 1.0F, 33.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(52, 20).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(-7.0F, -3.0F, -7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(3.0F, -3.0F, -7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(3.0F, -3.0F, 3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -3.0F, 3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

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
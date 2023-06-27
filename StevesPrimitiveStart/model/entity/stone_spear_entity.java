// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class stone_spear_entity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stone_spear_entity"), "main");
	private final ModelPart all;
	private final ModelPart bb_main;

	public stone_spear_entity(ModelPart root) {
		this.all = root.getChild("all");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -1.0F, -25.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -1.0F, -9.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-0.8F, -0.8F, 7.0F, 1.6F, 1.6F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(-0.6F, -0.6F, 15.0F, 1.2F, 1.2F, 7.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(58, 60).addBox(-0.7F, -24.0F, -0.7F, 1.4F, 2.0F, 1.4F, new CubeDeformation(0.0F))
		.texOffs(57, 59).addBox(-0.9F, -22.0F, -0.9F, 1.8F, 2.0F, 1.8F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
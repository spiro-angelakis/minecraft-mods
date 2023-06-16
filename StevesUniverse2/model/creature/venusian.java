// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class venusian<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "venusian"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart mane;
	private final ModelPart front_left_arm;
	private final ModelPart front_right_arm;
	private final ModelPart back_left_leg;
	private final ModelPart back_right_leg;

	public venusian(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.mane = root.getChild("mane");
		this.front_left_arm = root.getChild("front_left_arm");
		this.front_right_arm = root.getChild("front_right_arm");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_right_leg = root.getChild("back_right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition head_rotation = head.addOrReplaceChild("head_rotation", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, -4.5F, 0.8727F, 0.0F, 0.0F));

		PartDefinition head_rotation_r1 = head_rotation.addOrReplaceChild("head_rotation_r1", CubeListBuilder.create().texOffs(91, 66).addBox(-3.0F, -23.5221F, -12.997F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(93, 95).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7779F, 1.9688F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head_rotation_r2 = head_rotation.addOrReplaceChild("head_rotation_r2", CubeListBuilder.create().texOffs(0, 41).addBox(-7.0F, -3.0F, -9.5F, 14.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0707F, -1.0735F, -0.8727F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 4.5F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.0574F, 2.9724F, -1.0472F, 0.0F, 0.0F));

		PartDefinition mane = partdefinition.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 13.5F));

		PartDefinition mane_r1 = mane.addOrReplaceChild("mane_r1", CubeListBuilder.create().texOffs(48, 48).addBox(0.0F, -21.0F, -27.5F, 0.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 20.0F, 2.5F, -0.9163F, 0.0F, 0.0F));

		PartDefinition front_left_arm = partdefinition.addOrReplaceChild("front_left_arm", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -4.0F, -2.5F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(8.25F, -15.0F, 2.0F));

		PartDefinition front_left_leg_r1 = front_left_arm.addOrReplaceChild("front_left_leg_r1", CubeListBuilder.create().texOffs(70, 78).addBox(-3.0F, -7.0F, -3.0F, 7.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, 11.0F, -0.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition front_right_arm = partdefinition.addOrReplaceChild("front_right_arm", CubeListBuilder.create().texOffs(0, 0).addBox(-5.75F, -3.5F, -2.5F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.25F, -16.5F, 2.0F));

		PartDefinition front_left_leg_r2 = front_right_arm.addOrReplaceChild("front_left_leg_r2", CubeListBuilder.create().texOffs(70, 78).addBox(-3.0F, -7.0F, -3.0F, 7.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, 12.5F, -0.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition back_left_leg = partdefinition.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 67).addBox(-1.5F, 7.0F, -9.5F, 9.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 2.0F, 14.0F));

		PartDefinition back_left_leg_r1 = back_left_leg.addOrReplaceChild("back_left_leg_r1", CubeListBuilder.create().texOffs(68, 41).addBox(-2.5F, -2.5F, -3.5F, 7.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition back_right_leg = partdefinition.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(0, 67).addBox(-7.5F, 6.0F, -9.5F, 9.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 3.0F, 14.0F));

		PartDefinition back_right_leg_r1 = back_right_leg.addOrReplaceChild("back_right_leg_r1", CubeListBuilder.create().texOffs(68, 41).addBox(-4.5F, -2.5F, -3.5F, 7.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.5F, 0.0F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mane.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
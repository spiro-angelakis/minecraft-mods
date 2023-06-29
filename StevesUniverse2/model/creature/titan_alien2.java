// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class titan_alien2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "titan_alien2"), "main");
	private final ModelPart torso;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart head;

	public titan_alien2(ModelPart root) {
		this.torso = root.getChild("torso");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 149).addBox(-18.0F, 2.0F, -32.0F, 36.0F, 28.0F, 30.0F, new CubeDeformation(0.0F))
		.texOffs(0, 178).addBox(-16.5F, 0.0F, -34.0F, 33.1F, 30.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -67.0F, 0.0F));

		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 192).addBox(-12.0F, -11.0F, 16.0F, 24.0F, 22.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(51, 149).addBox(-14.0F, -11.0F, 10.0F, 28.0F, 24.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(47, 193).addBox(-16.0F, -11.0F, -20.0F, 32.0F, 26.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.0F, 24.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 208).addBox(-14.0F, -11.0F, -13.0F, 28.0F, 22.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.0F, -5.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(25, 83).addBox(-8.0F, 81.0F, -0.8774F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(-18.0F, -62.0F, -18.0F));

		PartDefinition cube_r3 = right_arm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 119).addBox(-7.0F, 14.3187F, 3.0F, 2.0F, 22.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(105, 109).addBox(-3.0F, 38.3187F, 3.0F, 8.0F, 24.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(60, 101).addBox(-5.0F, 16.3187F, 1.0F, 12.0F, 22.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 18.6813F, 6.1226F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = right_arm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 72).addBox(-30.0F, -36.0F, -16.0F, 16.0F, 26.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(54, 119).addBox(-28.7F, -14.0F, -14.0F, 2.7F, 24.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(34, 94).addBox(-26.0F, -14.0F, -16.0F, 12.0F, 26.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 83).addBox(-28.0F, -34.0F, -18.0F, 16.0F, 26.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, 25.0F, 18.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(135, 11).mirror().addBox(-4.0F, 84.0F, -0.8774F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(18.0F, -65.0F, -18.0F));

		PartDefinition cube_r5 = left_arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(176, 47).mirror().addBox(5.0F, 14.3187F, 3.0F, 2.0F, 22.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(215, 37).mirror().addBox(-5.0F, 38.3187F, 3.0F, 8.0F, 24.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(170, 29).mirror().addBox(-7.0F, 16.3187F, 1.0F, 12.0F, 22.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 21.6813F, 6.1226F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = left_arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(196, 0).mirror().addBox(14.0F, -36.0F, -16.0F, 16.0F, 26.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(164, 47).mirror().addBox(26.0F, -14.0F, -14.0F, 2.8F, 24.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(144, 22).mirror().addBox(14.0F, -14.0F, -16.0F, 12.0F, 26.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(110, 11).mirror().addBox(12.0F, -34.0F, -18.0F, 16.0F, 26.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-18.0F, 28.0F, 18.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(190, 50).addBox(-4.4F, 75.7234F, -9.3287F, 8.7F, 8.0F, 12.8F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, -61.0F, 24.0F));

		PartDefinition cube_r7 = right_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(151, 51).addBox(-4.5F, -17.0F, 6.0F, 9.0F, 26.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(217, -3).addBox(-3.1F, -15.0F, 2.0F, 6.0F, 22.0F, 12.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 76.7234F, -2.5287F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = right_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(111, 42).addBox(-20.0F, 22.0F, 16.0F, 8.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 24.0F, -20.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = right_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(197, 29).addBox(-20.7F, 6.0F, 4.0F, 9.3F, 28.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 24.0F, -20.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r10 = right_leg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(165, 9).addBox(-22.0F, -34.0F, 6.0F, 12.0F, 38.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 24.0F, -20.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(190, 50).mirror().addBox(-4.5F, 74.7234F, -9.2287F, 8.9F, 8.0F, 12.7F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(16.0F, -60.0F, 24.0F));

		PartDefinition cube_r11 = left_leg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(151, 51).mirror().addBox(-4.7F, -17.0F, 6.0F, 9.3F, 26.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(219, -1).mirror().addBox(-3.5F, -15.0F, 2.0F, 7.1F, 22.0F, 10.9F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 75.7234F, -2.5287F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = left_leg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(111, 42).mirror().addBox(12.0F, 22.0F, 16.0F, 8.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.0F, 23.0F, -20.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r13 = left_leg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(197, 29).mirror().addBox(11.3F, 6.0F, 4.0F, 9.4F, 28.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.0F, 23.0F, -20.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r14 = left_leg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(165, 9).mirror().addBox(10.0F, -34.0F, 6.0F, 12.0F, 38.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.0F, 23.0F, -20.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -61.0556F, -29.3429F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 67).addBox(-12.0F, -17.0F, -40.0F, 24.0F, 6.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(58, 73).addBox(-6.0F, -15.0F, -42.0F, 12.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(57, 25).addBox(-8.0F, -9.0F, -40.0F, 16.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(64, 61).addBox(-10.0F, -11.0F, -40.0F, 20.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 76).addBox(-4.0F, -15.0F, -42.0F, 8.0F, 24.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -17.0F, -40.0F, 12.0F, 28.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-14.0F, -19.0F, -38.0F, 28.0F, 26.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 0).addBox(-12.0F, 5.0F, -38.0F, 24.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-16.0F, -21.0F, -36.0F, 32.0F, 28.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.0F, 13.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
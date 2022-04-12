# Guia de configuração básica

## Ambiente básico

Para nosso ambiente de trabalho você precisará das seguintes ferramentas instaladas:

- Docker
- Visual Code Studio
- WSL 2
- Distro Linux WSL: Ubuntu é o recomendável

*É recomendável também que seu computador tenha 8gb + de ram para suportar todos os recursos ativos.*

### Integrando Docker ao WSL

Para termos um ambiente mais simples vamos integrar o Docker ao WSL. Em configurações na Aba Resources, vá em WSL Integration e selecione sua distro.
**Isso permite você utilizar o docker dentro da sua distro linux, compartilhando o mesmo docker entre windows e linux.**

### Usando Visual Code

Para gerenciar o projeto em um nível mais alto usamos o Visual Code, ele contém algumas ferramentas que tornam o uso do WSL, Docker e Kubernetes mais simples. **Abra a raiz do projeto com Visual Code, há um arquivo de configuração do visual code (code-workspace), você pode abri-lo e iniciar a workspace. Provavelmente exibirá uma mensagem informando quais extensões são recomendadas, caso isso não acontença, na aba de extensões essas recomendações ficarão visíveis**.

## Instalação do Kubernetes Local

Para deixar as coisas mais simples utilizamos a distruição minimal do Kubernetes da Rancher Labs, chamado K3D. Você pode realizar a instalação com o comando abaixo dentro do WSL:

~~~~console
wget -q -O - https://raw.githubusercontent.com/k3d-io/k3d/main/install.sh | TAG=v5.0.0 bash
~~~~

Agora você está pronto para criar seu primeiro cluster:

~~~console
k3d cluster create nomeDoCluster --agents 2
~~~~

Com o cluster criado, você pode dar uma conferida se está tudo certo:

~~~console
kubectl get nodes
~~~~

Você pode conferir também seu docker desktop, note que mesmo criando seu cluster dentro do WSL os containers são compartilhados entre linux e windows por conta de integração.
